package com.practice.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.departmentservice.entity.Department;
import com.practice.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department dept){
		log.info("Inside saveDepartment of DepartmentService");
		return departmentRepository.save(dept);
	}
	
	public Department findDepartmentById(long id) {
		log.info("Inside findDepartmentById of DepartmentService");
		return departmentRepository.findByDepartmentId(id);
		
	}
}
