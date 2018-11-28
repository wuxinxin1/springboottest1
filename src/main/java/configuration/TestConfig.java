package configuration;

import model.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by wuxinxin on 2018/11/28.
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("dev testBean");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("prod testBean");
    }
}
