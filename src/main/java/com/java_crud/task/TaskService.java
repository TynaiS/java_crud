package com.java_crud.task;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getALlTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getAllTasksForBoard(Long boardId) {
        return  taskRepository.findAllByBoardId(boardId);
    }

    public void createTask(Task task) {
        System.out.println("task created");
        taskRepository.save(task);
    }
}
