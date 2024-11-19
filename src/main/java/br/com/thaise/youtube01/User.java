package br.com.thaise.youtube01;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name= User.TABLE_NAME)

public class User {
	public static final String TABLE_NAME="User";
	
@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private Long id;
	@Column(name="username", length=100, nullable=false, unique=true)
	private String username;
	@Column(name="username", length=100, nullable=false, unique=true)
	private String password;
	
	public User() {
		super();
	}

	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public static String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	
	
	

}
