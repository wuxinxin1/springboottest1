package service;

import org.springframework.context.ApplicationEvent;

/**
 * Created by wuxinxin on 2018/11/26.
 */
public class DemoEvent  extends ApplicationEvent{

    private String msg;

    public DemoEvent(Object source,String mgs) {
        super(source);
        this.msg=mgs;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
