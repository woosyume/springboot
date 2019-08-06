package com.rakuten.summerinternship.component.controller;

import com.rakuten.summerinternship.database.domain.Task;
import com.rakuten.summerinternship.database.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	TaskService service;
	
	@Autowired
	public IndexController(TaskService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		Page<Task> tasks = service.getAllTasks(PageRequest.of(0, 10));
		model.addAttribute("tasks", tasks);

		return "home";
	}

	@GetMapping("/create")
    public String tasks(Model model) {
        return "create";
    }
}
