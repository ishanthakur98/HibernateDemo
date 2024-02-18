package com.crazzycoding.DemoHib;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="User")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class User {

	@Id
	@Column(name = "userid")
	private String userid;

	@Column(name = "username")
	private Username username;

	@Column(name = "email")
	private String email;

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + "]";
	}

	public String getId() {
		return userid;
	}

	public void setId(String id) {
		this.userid = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Username getUsername() {
		return username;
	}

	public void setUsername(Username username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
