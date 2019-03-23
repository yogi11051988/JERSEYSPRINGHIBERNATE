package com.example.daoModel;
import java.io.Serializable;

/**
 * @author Yogesh Potdar
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class UserManagementModel implements Serializable{    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID",unique = true, nullable = false,length=10)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	//1-25
	@Column(name="FIRSTNAME", nullable = false,length=25)
	private String firstName;
	//0-25 N
	@Column(name="LASTNAME", nullable = true,length=25)
	private String lastName;
	//6-50
	@Column(name="EMAIL", nullable = false,length=50)
	private String email;
	//5-50
	@Column(name="PASSWORD", nullable = false,length=50)
	private String password;
	
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static class UserBuilder{
		
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		private String password;
		
		public UserBuilder() {
			super();
		}
		
		public UserBuilder(String firstName,String lastName,String email,String password) {
			super();
			this.firstName=firstName;
			this.lastName=lastName;
			this.email=email;
			this.password=password;
		}
		
		public UserManagementModel build() {
			return new  UserManagementModel(this);
		}
	}
	
	public UserManagementModel(UserBuilder userBuilder) {
		this.firstName=userBuilder.firstName;
		this.lastName=userBuilder.lastName;
		this.email=userBuilder.email;
		this.password=userBuilder.password;
	}
	public UserManagementModel() {
		super();
	}
	public UserManagementModel(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
}
