package com.jxjr.projectmanage.controller;


import com.jxjr.projectmanage.dao.TaskRepository;
import com.jxjr.projectmanage.domain.Task;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tasks")
public class ProjectController {

  @Autowired
  private TaskRepository taskRepository;


  @ApiOperation(value = "获取任务列表", notes = "")
  @RequestMapping(value = {""}, method = RequestMethod.GET)
  public ArrayList<Task> getAll() {
    return taskRepository.findAll();
  }

  @ApiOperation(value = "插入一条任务", notes = "插入一条任务")
  @RequestMapping(value = {""}, method = RequestMethod.POST)
  public Task postTask(@RequestBody Task task) {
    Task save = taskRepository.save(task);
    return save;
  }

  @ApiOperation(value = "修改任务详情", notes = "修改一条任务")
  @ApiImplicitParam(name = "id", value = "任务id", required = true, dataType = "Integer", paramType = "path")
  @RequestMapping(value = {"/{id}"}, method = RequestMethod.PUT)
  public String putTask(@PathVariable Long id, @RequestBody Task task) {
    task.setId(id);
    taskRepository.save(task);
    return "success";
  }

  @ApiOperation(value = "删除用户", notes = "根据id删除对象")
  @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
  public String deletTask(@PathVariable Long id) {
    String success = "task not excist";
    if (taskRepository.existsById(id)) {
      taskRepository.deleteById(id);
      success = "success";
    }
    return success;
  }
}
