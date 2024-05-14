package com.gdu.myapp2.service;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

public interface BbsService {
  int registerBbs(HttpServletRequest request);
  void loadBbsList(HttpServletRequest request, Model model);
  int registerReply(HttpServletRequest request);
  int removeBbs(int bbsNo);
  void loadBbsSearchList(HttpServletRequest request, Model model); 
}
