package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {
	
	@Autowired
	EmployeeRepo employee;
	
	public Employee saveInfo(Employee e) {
		return employee.save(e);
	}
	
	public ResponseEntity<Employee> showInfo() {
		return employee.findAll();
	}
}