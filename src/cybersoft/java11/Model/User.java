package cybersoft.java11.Model;

public class User {
	private String userName;
	private String passWord;
	private String age;
	private String name;
	
	public User() {
		userName="";
		passWord="";
		age = "";
		name = "";
	}
	
	public User(String userName, String passWord) {
		this.userName=userName;
		this.passWord=passWord;
	}
	
	public User(String userName, String passWord, String age, String name) { 
		this.userName = userName;
		this.passWord = passWord;
		this.age = age;
		this.name = name;
	}
 	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
}
