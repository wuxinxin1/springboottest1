package service;

/**
 * Created by wuxinxin on 2018/11/26.
 */
public class BeanWayService {

    public void init(){
        System.out.println("init BeanWayService");
    }

    public BeanWayService() {
        System.out.println("contruct BeanWayService");
    }

    public  void destory(){
        System.out.println("destory BeanWayService");
    }
}
