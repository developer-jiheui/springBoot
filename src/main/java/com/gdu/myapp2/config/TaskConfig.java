package com.gdu.myapp2.config;

import com.gdu.myapp2.scheduler.RemoveBlogImageScheduler;
import com.gdu.myapp2.scheduler.RemoveTempFilesScheduler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Configuration
public class TaskConfig {

    @Bean
    RemoveBlogImageScheduler removeBlogImageTask(){
        return new RemoveBlogImageScheduler();
    }
    @Bean
    RemoveTempFilesScheduler removeBlogImage(){
        return new RemoveTempFilesScheduler();
    }

}
