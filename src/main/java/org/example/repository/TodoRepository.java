package org.example.repository;

import org.example.domain.TodoItem;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoRepository {

    private List<TodoItem> todoItems = new ArrayList<>();

    public List<TodoItem> fetchAllTodoItems(){

        TodoItem item1 = new TodoItem();
        item1.setId(todoItems.size() + 1);
        item1.setIsDone(false);
        item1.setTask("Task #" + (todoItems.size() + 1));

        todoItems.add(item1);

        return todoItems;
    }
}
