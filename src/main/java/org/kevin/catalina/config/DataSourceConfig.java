package org.kevin.catalina.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfig {
	
	@Resource
	private DataConfigBean config;
	
	@Bean
	public DataSource dataSource() {
		 DruidDataSource ds = new DruidDataSource(); 
		 ds.setDriverClassName(config.getDriverClassName());
		 ds.setUrl(config.getUrl());
		 ds.setUsername(config.getUsername());
		 ds.setPassword(config.getPassword());
		 return ds;
	}

}
