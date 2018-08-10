package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;

@Service
@CacheConfig(cacheNames = "emp")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Override
	@Cacheable()
	public List<Employee> getEmployees() {
		System.out.println("EmployeeServiceImpl :: getEmployees : started");
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("1","AA"));
		list.add(new Employee("2","ZZ"));
		list.add(new Employee("3","QQ"));
		return list;
	}


    @CacheEvict(allEntries = true)
    public void clearCache() {
    	//do nothing
    }
	
}
