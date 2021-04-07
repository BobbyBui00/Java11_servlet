package cybersoft.java11.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java11.controller.AuthController;

public class RegisterServlet extends HttpServlet{
	
	AuthController authController;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		authController = new AuthController();
	} 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		String forHTML= "	<form method=\"POST\" action=\"\">\n"
				+ "		<label for=\"userID\"> Username:  </label>\n"
				+ "		<input type=\"text\" name=\"userName\" id=\"userID\">\n"
				+ "		<label for=\"password\"> Password:  </label>\n"
				+ "		<input type=\"password\" name=\"passWord\" id=\"password\">\n"
				+ "		<label for=\"age\">Age: </label>\n"
				+ "		<input type=\"text\" name=\"age\" id=\"age\">\n"
				+ "		<label for=\"name\">Name: </label>\n"
				+ "		<input type=\"text\" name=\"name\" id=\"name\">\n"
				+ "		<input type=\"submit\" value=\"Register\">\n"
				+ "	</form>";
		
		writer.append(forHTML);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		String userName=req.getParameter("userName");
		String passWord=req.getParameter("passWord");
		String age = req.getParameter("age");
		String name = req.getParameter("name");
		
		System.out.println(userName);
		System.out.println(passWord);
		System.out.println(age);
		System.out.println(name);
		
		PrintWriter writer=resp.getWriter();
		
		if(AuthController.register(userName, passWord, age, name)) {
			writer.append("register successfully");
		} else {
			writer.append("Please check userName or passWord again");
		}
		
		
	}
}
