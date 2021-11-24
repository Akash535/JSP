package JSP_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyProfileDao {
	public static RegisterModel profile(String e) {
		RegisterModel rm=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", 
					"root","akki1312");
			PreparedStatement ps=con.prepareStatement("select *from clgstudent where semail=? ");
			ps.setString(1,e);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				rm=new RegisterModel();
				rm.setId(rs.getInt("id"));
				rm.setSname(rs.getString("sname"));
				rm.setBranch(rs.getString("branch"));
				rm.setSemail(rs.getString("semail"));
				rm.setPhone(rs.getString("phone"));
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return rm;
	}
}
