package test;

import configuration.TestConfig;
import model.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wuxinxin on 2018/11/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class IntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void test1(){
        System.out.println(testBean.getContent());
    }
}
