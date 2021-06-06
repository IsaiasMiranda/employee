package entities;

public class User {

	private Integer id;
	private String user;
	private String email;

	public User() {
	}

	public User(Integer id, String user, String email) {
		this.id = id;
		this.user = user;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
