package anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.lang.annotation.*;

/**
 * 定义组合注解
 * Created by wuxinxin on 2018/11/26.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan("service")
@PropertySource("classpath:test.properties")
public @interface WiselyConfiguration {
}
