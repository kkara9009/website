package wniemiec.app.nforum.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/auth/signin", "/auth/signup", "/auth/logout"})
public class AuthController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private SignInController signInController = new SignInController();
	private SignUpController signUpController = new SignUpController();
	private LogoutController logoutController = new LogoutController();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		if ("/auth/signin".equalsIgnoreCase(uri)) {
			signInController.doGet(request, response);
		}
		else if ("/auth/signup".equalsIgnoreCase(uri)) {
			signUpController.doGet(request, response);
		}
		else if ("/auth/logout".equalsIgnoreCase(uri)) {
			logoutController.doGet(request, response);
		}
		else {
			signInController.doGet(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		if ("/auth/signin".equalsIgnoreCase(uri)) {
			signInController.doPost(request, response);
		}
		else if ("/auth/signup".equalsIgnoreCase(uri)) {
			signUpController.doPost(request, response);
		}
	}
}