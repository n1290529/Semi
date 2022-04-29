package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.TaskRepository;

public class TaskService {
	@Autowired
	TaskRepository taskRepo;
}
