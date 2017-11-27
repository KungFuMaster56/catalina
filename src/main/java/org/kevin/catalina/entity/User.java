package org.kevin.catalina.entity;

public class User {
	
	private String user_id;
	private String login_account;
	private String user_name;
	private String login_pass;
	private String register_time;
	private String user_phone;
	private String user_email;
	private String user_sex;
	private String user_birthday;
	private String valid;
	private String department_key;
	private String department_value;
	

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getLogin_account() {
		return login_account;
	}
	public void setLogin_account(String login_account) {
		this.login_account = login_account;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getLogin_pass() {
		return login_pass;
	}
	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public String getDepartment_key() {
		return department_key;
	}
	public void setDepartment_key(String department_key) {
		this.department_key = department_key;
	}
	public String getDepartment_value() {
		return department_value;
	}
	public void setDepartment_value(String department_value) {
		this.department_value = department_value;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", login_account=" + login_account + ", user_name=" + user_name
				+ ", login_pass=" + login_pass + ", register_time=" + register_time + ", user_phone=" + user_phone
				+ ", user_email=" + user_email + ", user_sex=" + user_sex + ", user_birthday=" + user_birthday + "]";
	}
	
	
	

}
