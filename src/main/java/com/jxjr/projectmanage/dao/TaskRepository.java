package com.jxjr.projectmanage.dao;

import com.jxjr.projectmanage.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
  @Override
  ArrayList<Task> findAll();
}
