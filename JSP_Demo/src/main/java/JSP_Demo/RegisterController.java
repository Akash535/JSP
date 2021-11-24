package JSP_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		RegisterModel rm=new RegisterModel();
		rm.setSname(request.getParameter("sname"));
		rm.setSemail(request.getParameter("semail"));
		rm.setPsw(request.getParameter("psw"));
		rm.setPhone(request.getParameter("phone"));
		rm.setGender(request.getParameter("gender"));
		rm.setBranch(request.getParameter("branch"));
		rm.setAd(request.getParameter("ad"));
		
		int i=RegisterDao.insertclgstudent(rm);
		if(i>0)
			out.println("<h3>Data Inserted Successful !!!</h3>");
		else
			out.println("<h3>Try Again !!!</h3>");
	}

}
