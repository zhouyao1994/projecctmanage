package com.jxjr.projectmanage.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
  public Task() {
  }

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;
  private String taskTitle;
  private String taskStage;
  private String priorDutyGroup;
  private String devGroup;
  private boolean isRequestTest;
  private boolean isMaoYianTest;
  private String dutyPerson;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTaskTitle() {
    return taskTitle;
  }

  public void setTaskTitle(String taskTitle) {
    this.taskTitle = taskTitle;
  }

  public String getTaskStage() {
    return taskStage;
  }

  public void setTaskStage(String taskStage) {
    this.taskStage = taskStage;
  }

  public String getPriorDutyGroup() {
    return priorDutyGroup;
  }

  public void setPriorDutyGroup(String priorDutyGroup) {
    this.priorDutyGroup = priorDutyGroup;
  }

  public String getDevGroup() {
    return devGroup;
  }

  public void setDevGroup(String devGroup) {
    this.devGroup = devGroup;
  }

  public boolean isRequestTest() {
    return isRequestTest;
  }

  public void setRequestTest(boolean requestTest) {
    isRequestTest = requestTest;
  }

  public boolean isMaoYianTest() {
    return isMaoYianTest;
  }

  public void setMaoYianTest(boolean maoYianTest) {
    isMaoYianTest = maoYianTest;
  }

  public String getDutyPerson() {
    return dutyPerson;
  }

  public void setDutyPerson(String dutyPerson) {
    this.dutyPerson = dutyPerson;
  }
}
