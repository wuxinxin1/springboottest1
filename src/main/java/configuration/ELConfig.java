package configuration;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import service.BeanWayService;
import service.JSR250WayService;

import java.io.IOException;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Configuration
@ComponentScan("service")
@PropertySource("classpath:test.properties")
public class ELConfig {
    @Value("i love you")
    private String aa;

    @Value("${book.author}")
    private String bookAuthor;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(initMethod = "init",destroyMethod = "destory")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    public  JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }

    public void out() throws IOException {
        System.out.println(aa);
        System.out.println(bookAuthor);
        System.out.println(IOUtils.toString(testFile.getInputStream()));
        System.out.println(IOUtils.toString(testUrl.getInputStream()));
        System.out.println(environment.getProperty("book.author"));
    }
}
