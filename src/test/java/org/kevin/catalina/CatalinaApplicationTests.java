package org.kevin.catalina;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CatalinaApplicationTests {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void contextLoads() {
		List<Map<String,Object>> temp = jdbcTemplate.queryForList("select * from sys_user");
		System.out.println(temp.toString());
	}

}
