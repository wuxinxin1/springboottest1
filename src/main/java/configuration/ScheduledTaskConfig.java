package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Configuration
@ComponentScan("service")
@EnableScheduling
public class ScheduledTaskConfig {
}
