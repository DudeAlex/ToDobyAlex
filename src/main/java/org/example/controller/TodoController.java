package org.example.controller;

import java.util.List;

import org.example.domain.TodoItem;
import org.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepo;

    @GetMapping("/api/todoItems")
    public List<TodoItem> fetchAllTodoItems(){
        return todoRepo.fetchAllTodoItems();
    }

}