package JSP_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		LoginModel lm=new LoginModel();
		lm.setUemail(request.getParameter("uemail"));
		lm.setPsw(request.getParameter("psw"));
		boolean status=LoginDao.Verify(lm);
		if(status) {
			HttpSession hs=request.getSession();
			hs.setAttribute("uemail",lm.getUemail());
			
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.include(request, response);
		}
		else {
			out.println("<h3>Username or Password Error !!!<br> Please Enter valid input</h3>");
			
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	}

}
