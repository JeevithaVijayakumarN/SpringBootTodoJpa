package com.nseit.SpringBootTodoJpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class ToDo {
    private Integer id;
    @Id
    @GeneratedValue
    private String name;
    private boolean isCompleted;
}
