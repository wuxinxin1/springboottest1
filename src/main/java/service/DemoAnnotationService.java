package service;

import anno.Action;
import org.springframework.stereotype.Service;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截add操作")
    public void add(){
        System.out.println("DemoAnnotationService");
    }
}
