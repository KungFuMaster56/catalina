package org.kevin.catalina.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.kevin.catalina.entity.User;

public interface UserMapper {

	@Select("select u.*,d.department_value from sys_user u left join sys_department d on u.department_key = d.department_key")
	List<User> getAll();
	
	@Insert("insert into sys_user(user_name,login_account,login_pass,register_time,valid,department_key)values(#{user_name},#{login_account},#{login_pass},#{register_time},#{valid},#{department_key})")
	Integer addUser(User user);
	
	@Delete("delete from sys_user where login_account=#{login_account}")
	Integer delUser(User user);
	
	@Update("update sys_user set user_name=#{user_name},login_account=#{login_account},valid=#{valid},department_key=#{department_key} where user_id=#{user_id}")
	Integer updUser(User user);
	
	User findUserById(@Param("user_id")String user_id);
}
