package com.rakuten.controller;

import com.rakuten.domain.Task;
import com.rakuten.service.TaskService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping("/tasks")
    public String members(Model model) {
        Page<Task> results = taskService.getAllTasks(PageRequest.of(0, 10));
        model.addAttribute("tasks", results);
        return "tasks/taskList";
    }
}