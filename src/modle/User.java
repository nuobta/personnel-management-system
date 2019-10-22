package modle;

public class User {
	private String Username;
	private String password;
	private boolean isadmin=false;
	public User(String username, String password, boolean isadmin) {
		super();
		Username = username;
		this.password = password;
		this.isadmin = isadmin;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isIsadmin() {
		return isadmin;
	}
	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}
}