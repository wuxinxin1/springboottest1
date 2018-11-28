package test;

import configuration.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import service.*;

import java.io.IOException;

/**
 * Created by wuxinxin on 2018/11/26.
 */
public class AnnoTest {

   //ApplicationContextAware


    public static void main(String[] args) throws Exception {
       test10();
    }

    public static void test10() throws IOException, InterruptedException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService bean = annotationConfigApplicationContext.getBean(DemoService.class);

        System.out.println(bean.getAuthor());

    }

    public static void test9() throws IOException, InterruptedException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ConditionConfig.class);

        Thread.sleep(200000);

        ListService bean = annotationConfigApplicationContext.getBean(ListService.class);


        System.out.println(bean.showListCmd());


    }


    public static void test8() throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);

        //annotationConfigApplicationContext.close();
    }

    public static void test7() throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService bean = annotationConfigApplicationContext.getBean(AwareService.class);


        bean.out();

        annotationConfigApplicationContext.close();
    }


    public static void test6() throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher bean = annotationConfigApplicationContext.getBean(DemoPublisher.class);


        bean.publish("hello");


        annotationConfigApplicationContext.close();
    }

    public static void test5() throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("prod");
        annotationConfigApplicationContext.register(ProfileConfig.class);
        annotationConfigApplicationContext.refresh();

        DemoBean bean = annotationConfigApplicationContext.getBean(DemoBean.class);

        System.out.println(bean.getContent());

        annotationConfigApplicationContext.close();
    }

    public static void test4() throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ELConfig.class);

        annotationConfigApplicationContext.close();
    }


    public static void test3() throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ELConfig.class);

        ELConfig bean = annotationConfigApplicationContext.getBean(ELConfig.class);

        bean.out();
        annotationConfigApplicationContext.close();
    }

    public static void test2(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(DiConfig.class);

        DemoAnnotationService bean = annotationConfigApplicationContext.getBean(DemoAnnotationService.class);

        DemoMethodService bean1 = annotationConfigApplicationContext.getBean(DemoMethodService.class);

        bean.add();

        bean1.add();

        annotationConfigApplicationContext.close();
    }

    public static void test1(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService bean = annotationConfigApplicationContext.getBean(UseFunctionService.class);

        String wxx = bean.sayHello("wxx");

        System.out.println(wxx);

        annotationConfigApplicationContext.close();
    }

}
