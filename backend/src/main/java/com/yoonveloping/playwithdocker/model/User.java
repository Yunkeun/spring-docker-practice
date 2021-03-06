package com.yoonveloping.playwithdocker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User {

	@Id @GeneratedValue
	private Long id;

	private String userName;

	private String password;

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", userName='" + userName + '\'' +
			", password='" + password + '\'' +
			'}';
	}
}
