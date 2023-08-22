package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.example.demo.Models.Employee;
import com.example.demo.Service.ApiService;

@RestController
public class StudentController {
	
	@Autowired
	ApiService employeeService;
	
	@PostMapping("/addUser")
	public Employee add(@RequestBody Employee e) {
		return employeeService.saveInfo(e);
	}
	
	@GetMapping("/showlist")
	public ResponseEntity<Employee> show() {
		return employeeService.showInfo();
	}
}