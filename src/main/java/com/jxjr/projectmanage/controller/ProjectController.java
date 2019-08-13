package com.jxjr.projectmanage.controller;


import com.jxjr.projectmanage.domain.Task;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/tasks")
public class ProjectController {

  @ApiOperation(value = "获取任务列表", notes = "")
  @RequestMapping(value = {""}, method = RequestMethod.GET)
  public ArrayList<Task> getAll() {
    ArrayList<Task> tasks = new ArrayList<Task>();
    return tasks;
  }

  @ApiOperation(value = "插入一条任务", notes = "插入一条任务")
  @RequestMapping(value = {""}, method = RequestMethod.POST)
  public Task postTask(@RequestBody Task task) {
    return task;
  }

  @ApiOperation(value = "修改任务详情", notes = "修改一条任务")
  @ApiImplicitParam(name = "id", value = "任务id", required = true, dataType = "Integer", paramType = "path")
  @RequestMapping(value = {"/{id}"}, method = RequestMethod.PUT)
  public String putTask(@PathVariable Long id, @RequestBody Task task) {
    return "success";
  }

  @ApiOperation(value = "删除用户", notes = "根据id删除对象")
  @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
  public String deletTask(@RequestBody Task task){
    return "sucess";
  }
}
