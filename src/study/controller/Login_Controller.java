package study.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Login_Controller extends HttpServlet{
	@Override
	public void	doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String user_id = req.getParameter("user_id"),
				user_pw = req.getParameter("user_pw");
		System.out.println("id:"+user_id+"pw:"+user_pw);
		if(user_id==null) loginFalse();
		else if(user_pw==null) loginFalse();
		else loginTrue();

		
	}
	private void loginFalse(){
		System.out.println("false");
	}
	private void loginTrue(){
		System.out.println("true");
	}
}
