package org.kevin.catalina;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kevin.catalina.mapper.UserMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CatalinaApplicationTests2 {

	@Resource
	private UserMapper userMapper;
	
	@Test
	public void contextLoads() {
		System.out.println(userMapper.getAll().toString());
		System.out.println(userMapper.findUserById("2"));
	}

}
