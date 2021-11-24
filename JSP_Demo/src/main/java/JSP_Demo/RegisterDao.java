package JSP_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterDao {
	public static int insertclgstudent(RegisterModel rm) {
		int result=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo",
					"root","akki1312");
			PreparedStatement ps=con.prepareStatement("insert into clgstudent(sname,semail,psw,gender,"
					+ "branch,ad,phone) values(?,?,?,?,?,?,?)");
			
			ps.setString(1,rm.getSname());
			ps.setString(2,rm.getSemail());
			ps.setString(3,rm.getPsw());
			ps.setString(4,rm.getGender());
			ps.setString(5,rm.getBranch());
			ps.setString(6,rm.getAd());
			ps.setString(7,rm.getPhone());
			
			result=ps.executeUpdate();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
}
