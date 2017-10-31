package org.kevin.catalina.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.kevin.catalina.entity.User;

public interface UserMapper {

	@Select("select * from sys_user")
	List<User> getAll();
	
	@Insert("insert into sys_user(user_name,login_account,login_pass,register_time,valid)values(#{user_name},#{login_account},#{login_pass},#{register_time},#{valid})")
	Integer addUser(User user);
	
	@Delete("delete from sys_user where login_account=#{login_account}")
	Integer delUser(User user);
	
	@Update("update sys_user set user_name=#{user_name},login_account=#{login_account},valid=#{valid} where user_id=#{user_id}")
	Integer updUser(User user);
	
	User findUserById(@Param("user_id")String user_id);
}
