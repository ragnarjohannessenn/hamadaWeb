package com.hamadaintranet.entity;
// Generated Oct 13, 2020 10:20:22 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@NamedQueries({
	@NamedQuery(name = "Users.findAll", query = "Select u FROM Users u ORDER BY u.FullName")	
	})
@Table(name = "users", catalog = "hamadadb", uniqueConstraints = @UniqueConstraint(columnNames = "user_email"))
public class Users implements java.io.Serializable {

	private int userId;
	private String userEmail;
	private String userPass;
	private String userFullname;

	public Users() {
	}

	public Users(String userEmail, String userPass, String userFullname) {
		this.userEmail = userEmail;
		this.userPass = userPass;
		this.userFullname = userFullname;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int i) {
		this.userId = i;
	}

	@Column(name = "user_email", unique = true, nullable = false, length = 70)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "user_pass", nullable = false, length = 20)
	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Column(name = "user_fullname", nullable = false, length = 70)
	public String getUserFullname() {
		return this.userFullname;
	}

	public void setUserFullname(String userFullname) {
		this.userFullname = userFullname;
	}

}
