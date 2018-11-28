package service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat sim=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void rep(){
        System.out.println("每隔五秒执行一次:"+new Date());
    }


    @Scheduled(cron = "0 28 15 ? * *")
    public void rep1(){
        System.out.println("固定时间执行一次:"+new Date());
    }

}
