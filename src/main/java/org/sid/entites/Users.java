package org.sid.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Users implements Serializable{
	
	@Id
	private String username;
	private String password;
	
	@OneToMany(mappedBy="users", fetch=FetchType.LAZY)
	private Collection<UsersRoles> usersRoles;



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

	public Collection<UsersRoles> getUsersRoles() {
		return usersRoles;
	}

	public void setUsersRoles(Collection<UsersRoles> usersRoles) {
		this.usersRoles = usersRoles;
	}

	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

}
