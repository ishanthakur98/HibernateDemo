package com.crazzycoding.DemoHib;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="User")
public class Username {

	private String firstname;

	private String middlename;

	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Username [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + "]";
	}

}
