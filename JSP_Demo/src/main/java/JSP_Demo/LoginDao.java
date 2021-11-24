package JSP_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public static boolean Verify(LoginModel lm) {
		boolean status=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", 
					"root","akki1312");
			PreparedStatement ps=con.prepareStatement("select *from clgstudent where semail=? and psw=?");
			ps.setString(1,lm.getUemail());
			ps.setString(2,lm.getPsw());
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}
}
