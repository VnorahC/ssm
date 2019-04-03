package cn.yq.ssm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String username, String password, String email, String phone, Date birthday) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
	}
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String phone;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", phone="
				+ phone + ", birthday=" + birthday + "]";
	}
	
}
