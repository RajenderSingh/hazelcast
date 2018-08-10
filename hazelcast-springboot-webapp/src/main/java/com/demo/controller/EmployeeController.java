package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employee/", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployees() {
		System.out.println("EmployeeController :: getEmployees : started");
		List<Employee> users = employeeService.getEmployees();
		if(users.isEmpty()){
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/clearcache/", method = RequestMethod.GET)
	public ResponseEntity<Void> clearCache() {
		System.out.println("EmployeeController :: clearCache : started");
		employeeService.clearCache();
		return new ResponseEntity<Void>(new HttpHeaders(), HttpStatus.OK);
	}
}
