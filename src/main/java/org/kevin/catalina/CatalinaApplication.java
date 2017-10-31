package org.kevin.catalina;

import org.kevin.catalina.config.DataConfigBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({DataConfigBean.class})
@MapperScan("org.kevin.catalina.mapper")
public class CatalinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalinaApplication.class, args);
	}
}
