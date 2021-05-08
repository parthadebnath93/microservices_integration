package com.practice.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.userservice.VO.Department;
import com.practice.userservice.VO.ResponseTemplateVO;
import com.practice.userservice.entity.User;
import com.practice.userservice.repository.UserRepositoryImpl;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepositoryImpl userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user){
		log.info("Inside saveUser of UserService");
		return userRepo.save(user);
	}
	
	public ResponseTemplateVO findUserById(Long userId) {
		log.info("Inside findUserById of UserService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepo.findByUserId(userId);
		Department dept = restTemplate.getForObject("http://DEPARTMENT-TEST/departments/" + user.getDepartmentId(),
				Department.class);

		vo.setDepartment(dept);
		vo.setUser(user);
		return vo;
	}

}
