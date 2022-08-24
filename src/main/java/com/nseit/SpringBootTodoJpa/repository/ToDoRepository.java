package com.nseit.SpringBootTodoJpa.repository;


import com.nseit.SpringBootTodoJpa.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ToDoRepository extends JpaRepository<ToDo,Integer> {


}
