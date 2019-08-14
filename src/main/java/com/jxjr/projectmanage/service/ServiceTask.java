package com.jxjr.projectmanage.service;

import com.jxjr.projectmanage.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTask {

  @Autowired
  private TaskRepository taskRepository;
}
