package service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by wuxinxin on 2018/11/26.
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("init JSR250WayService");
    }

    public JSR250WayService() {
        System.out.println("contruct JSR250WayService");
    }

    @PreDestroy
    public  void destory(){
        System.out.println("destory JSR250WayService");
    }
}
