package com.gdu.myapp2.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.gdu.myapp2.service.UploadService;



public class RemoveTempFilesScheduler {

  @Autowired
  private UploadService uploadService;

  @Scheduled(cron="0 28 12 * * ?")
  public void execute() {
    uploadService.removeTempFiles();
  }
  
}
