package lti.quiz.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegisterBean;
import lti.quiz.service.UserService;
import lti.quiz.service.UserServiceImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user.quiz")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service;
	
	@Override
	public void init() throws ServletException {
		service=new UserServiceImpl();
		
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String referer= request.getHeader("referer");
		//Creates a fresh new session in server if no session id found in request header,
		//otherwise old session identified by id in request header
		HttpSession session = request.getSession();
		if(request.getParameter("logout")!=null)
		{
			//user request to logout
			session.invalidate();//destroying session
			response.sendRedirect("login.jsp?logout=yes");//send user to login page
		}
		else if(referer.contains("login")) {
			//Request is to login authentication
			LoginBean login = new LoginBean();
			login.setEmail(request.getParameter("userid"));
			login.setPassword(request.getParameter("password"));
			RegisterBean user = service.authenticate(login);
			if(user != null) {
				session.setAttribute("USER", user);//to remember the user throughout the session
				response.sendRedirect("dashboard.jsp?valid=yes");}
			else
				response.sendRedirect("login.jsp?invalid=yes");
		}else if(referer.contains("register")) {
			//Request is to register user
			RegisterBean register = new RegisterBean();
			register.setEmail(request.getParameter("email"));
			register.setPassword(request.getParameter("pass"));
			register.setAnswer(request.getParameter("answer"));
			if(service.register(register))
				response.sendRedirect("login.jsp?valid=yes");
			else
				response.sendRedirect("register.jsp?invalid=yes");
		}else if(referer.contains("forgot")) {
			//Request is to forgot password
			ForgetBean forget = new ForgetBean();
			forget.setEmail(request.getParameter("username"));
			forget.setAnswer(request.getParameter("answer"));
			if(service.validate(forget)) {
				session.setAttribute("EMAIL", forget.getEmail());
				response.sendRedirect("change.jsp");}
			else
				response.sendRedirect("forgot.jsp?invalid=yes");
			
		}else {
			//Request for change password
			LoginBean change = new LoginBean();
			change.setPassword(request.getParameter("password"));
			change.setEmail((String)session.getAttribute("EMAIL"));// gets remembered email id from forgot password page and sets in change password page
			if(service.update(change)) {
				session.removeAttribute("EMAIL");
				response.sendRedirect("login.jsp?changed=yes");}
			else
				response.sendRedirect("change.jsp?invalid=yes");
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
