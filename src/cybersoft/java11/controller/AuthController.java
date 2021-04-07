package cybersoft.java11.controller;

import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.Model.User;

public class AuthController {
	private static List<User> userList=new LinkedList<User>();;
	
	public AuthController() {
		userList.add(new User("admin", "admin"));
		userList.add(new User("abc", "def"));
	}
	
	public static boolean login(String userName, String passWord) {
		boolean result=false;
		
		for(User user: userList) {
			if(user.getUserName().equalsIgnoreCase(userName)) {
				return user.getPassWord().equals(passWord);
			}
		}
		return result;
	}
	
	public static boolean register(String userName, String passWord, String age, String name) {
		boolean result=false;
		
		for(User user: userList) {
			if (user.getUserName().equalsIgnoreCase(userName)) {
				return result;
			} else {
				result = true;
			}
		}
		
		if(result) {
			userList.add(new User(userName, passWord, age, name));
			return result;
		}
		
		return result;
	}
}
