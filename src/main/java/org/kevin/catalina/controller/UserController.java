package org.kevin.catalina.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.kevin.catalina.entity.User;
import org.kevin.catalina.mapper.UserMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	@Resource
	private UserMapper userMapper;
	
	@GetMapping
	public List<User> allUser(){
		return userMapper.getAll();
	}
	
	@PostMapping
	public Map<String,Object> addUser(@RequestBody User user){
		Map<String,Object> map = new HashMap<String,Object>();
		user.setLogin_pass("111");
		userMapper.addUser(user);
		return map;
	}
	
	@DeleteMapping
	public Map<String,Object> delUser(@RequestBody User user){
		Map<String,Object> map = new HashMap<String,Object>();
		userMapper.delUser(user);
		return map;
	}
	
	@PutMapping
	public Map<String,Object> updUser(@RequestBody User user){
		Map<String,Object> map = new HashMap<String,Object>();
		userMapper.updUser(user);
		return map;
	}
}
