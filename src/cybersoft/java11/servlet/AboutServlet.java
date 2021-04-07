package cybersoft.java11.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO:return about page
//		super.doGet(req, resp);
		PrintWriter writer = resp.getWriter();
		writer.append("This is about page");
		writer.append("The AboutServlet worked normally");
	}
	
}
