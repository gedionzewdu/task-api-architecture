package com.gediondev.taskapi.service

import com.gediondev.taskapi.dto.TaskDTO
import com.gediondev.taskapi.domain.Task

interface TaskService {
    fun getAllTasks(): List<Task>
    fun createTask(taskDTO: TaskDTO): Task
}
