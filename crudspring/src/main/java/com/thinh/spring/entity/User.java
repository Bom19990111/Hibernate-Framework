package com.thinh.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "username")
	@NotEmpty(message = "Vui lòng nhập tên user!")
	private String userName;

	@Column(name = "password")
	@NotEmpty(message = "Vui lòng nhập mật khẩu!")
	private String passWord;

	@Transient
	@NotEmpty(message = "Vui lòng nhập lại mật khẩu!")
	private String passWordConfirm;

	@Column(name = "fullname")
	@NotEmpty(message = "Vui lòng nhập tên người dùng!")
	private String fullName;

	@Column(name = "sex")
	private String sex;

	@Column(name = "age")
	@Min(value = 10, message = "Vui lòng chọn tuổi!")
	private String age;

	public User() {
	}

	public User(int id, String userName, String passWord, String passWordConfirm, String fullName, String sex,
			String age) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.passWordConfirm = passWordConfirm;
		this.fullName = fullName;
		this.sex = sex;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPassWordConfirm() {
		return passWordConfirm;
	}

	public void setPassWordConfirm(String passWordConfirm) {
		this.passWordConfirm = passWordConfirm;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
