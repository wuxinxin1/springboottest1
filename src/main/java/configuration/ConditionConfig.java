package configuration;

import model.LinuxCondition;
import model.WindowCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import service.LinuxListService;
import service.ListService;
import service.WindowsListService;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Configuration
@ComponentScan("service")
public class ConditionConfig {
    @Bean
    @Conditional(WindowCondition.class)
    public ListService WimndowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxListService(){
        return new LinuxListService();
    }
}
