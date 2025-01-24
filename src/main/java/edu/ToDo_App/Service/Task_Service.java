package edu.ToDo_App.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ToDo_App.Model.Task;
import edu.ToDo_App.Repo.TaskRepo;

@Service
public class Task_Service {

  @Autowired
  TaskRepo taskRepo;

  public void createTask(Task task) {
    if (task.getDetails() != null && task.getEnddate() != null && task.getSubject() != null) {
      taskRepo.save(task);

    } else {
      System.out.println("values not be null");
    }
  }

  public void deleteTask(Task taskId) {
    taskRepo.delete(taskId);
  }

}
