package com.gediondev.taskapi.controller

import com.gediondev.taskapi.dto.TaskDTO
import com.gediondev.taskapi.service.TaskService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/tasks")
class TaskController(
    private val taskService: TaskService
) {

    @GetMapping
    fun getTasks() = taskService.getAllTasks()

    @PostMapping
    fun createTask(@RequestBody taskDTO: TaskDTO) = taskService.createTask(taskDTO)
}
