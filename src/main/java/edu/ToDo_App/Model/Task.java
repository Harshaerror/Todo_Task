package edu.ToDo_App.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Data
@Table(name = "Task")
public class Task {
  @Id
  int TaskId;
  String Subject;
  String Details;
  String Enddate;
}
