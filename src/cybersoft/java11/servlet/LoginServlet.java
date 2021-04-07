package cybersoft.java11.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java11.controller.AuthController;

public class LoginServlet extends HttpServlet {
	
//	private AuthController authController;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		String forHTML= "<form method=\"POST\" action=\"\">\n"
				+ "		<label for=\"userID\"> Username:  </label>\n"
				+ "		<input type=\"text\" name=\"userName\" id=\"userID\">\n"
				+ "		<label for=\"userID\"> Password:  </label>\n"
				+ "		<input type=\"password\" name=\"passWord\" id=\"userID\">\n"
				+ "</br>"
				+ "		<input type=\"submit\" value=\"Login\">\n"
				+ "	</form>";
		
		writer.append(forHTML);
	}
	
//	@Override
//	public void init() throws ServletException {
//		// TODO Auto-generated method stub
//		super.init();
//		authController  = new AuthController();
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		resp.setContentType("text/html");
		String userName=req.getParameter("userName");
		String passWord=req.getParameter("passWord");
		System.out.println(userName);
		System.out.println(passWord);
		
		
		PrintWriter writer=resp.getWriter();
		if(AuthController.login(userName, passWord)) {
			writer.append("login successfully");
		} else {
			writer.append("Please check userName or passWord again");
		}
		
		
	}
}
