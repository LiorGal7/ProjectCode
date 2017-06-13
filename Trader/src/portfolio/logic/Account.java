package portfolio.logic;

public class Account {
	
	private String username;
	private String password;
	private Portfolio portfolio;
	
	public Account(String username,String password){
		setUsername(username);
		setPassword(password);
	}
	
//	public Account(AccountInfo aInfo){
//		setUsername(aInfo.username);
//		setPassword(aInfo.password);
//	}
	
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
	
	
}
