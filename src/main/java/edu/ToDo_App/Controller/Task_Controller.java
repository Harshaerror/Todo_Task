package edu.ToDo_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ToDo_App.Model.Task;
import edu.ToDo_App.Service.Task_Service;

@RestController
public class Task_Controller {

  @Autowired
  Task_Service task_Service;

  @PostMapping("/createtask")
  public void createTask(@RequestBody Task task) {

    task_Service.createTask(task);
  }

  @DeleteMapping("/deleteTask")
  public void deleteTask(@PathVariable Task TaskId) {
    task_Service.deleteTask(TaskId);
  }

}
