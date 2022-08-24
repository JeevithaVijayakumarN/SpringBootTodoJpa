package com.nseit.SpringBootTodoJpa.service;

import com.nseit.SpringBootTodoJpa.model.ToDo;
import com.nseit.SpringBootTodoJpa.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;
    public void add(ToDo toDo){
        toDoRepository.save(toDo);

    }public void update(ToDo toDo){
        toDoRepository.save(toDo);

    }public List<ToDo > view(){
        return toDoRepository.findAll();
    }
    public void delete(int id){
        List<ToDo> toDos = toDoRepository.findAll();
        for (ToDo toDo:toDos){
            if (id ==toDo.getId()){
                toDoRepository.delete(toDo);
            }
        }
    }
}
