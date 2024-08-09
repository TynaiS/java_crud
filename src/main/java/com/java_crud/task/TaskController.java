package com.java_crud.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/boards")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

//    @GetMapping
//    public List<Task> listTasks() {
//        return taskService.getALlTasks();
//    }

    @GetMapping("/{boardId}")
    public List<Task> listTasksForBoard(@PathVariable("boardId") Long boardId) {
        return taskService.getAllTasksForBoard(boardId);
    }

    @PostMapping("/{boardId}")
    public void createTask(@RequestBody Task task, @PathVariable("boardId") Long boardId) {
        System.out.println("test");
        taskService.createTask(task);
    }
}
