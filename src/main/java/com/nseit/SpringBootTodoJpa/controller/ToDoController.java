package com.nseit.SpringBootTodoJpa.controller;

import com.nseit.SpringBootTodoJpa.model.ToDo;
import com.nseit.SpringBootTodoJpa.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")

public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @PostMapping
    public void add(ToDo toDo) {
        toDoService.add(toDo);

    }

    @PutMapping
    public void update(ToDo toDo) {
        toDoService.update(toDo);
    }

    @GetMapping("all")
    public List<ToDo> view() {
        return toDoService.view();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        toDoService.delete(id);

    }
}
