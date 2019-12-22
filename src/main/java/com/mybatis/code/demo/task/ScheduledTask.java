package com.mybatis.code.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledTask {

    // 每隔1小时执行一次
    @Scheduled(cron = "0 0 */1 * * ?")
    public void scheduledTask(){
        System.out.println("cron打印时间:" + new Date());
    }

}
