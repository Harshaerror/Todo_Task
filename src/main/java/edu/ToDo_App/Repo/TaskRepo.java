package edu.ToDo_App.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.ToDo_App.Model.*;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer>

{

}