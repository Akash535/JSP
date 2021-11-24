package JSP_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BranchSearchDao {
	public static List<RegisterModel> Search_Branch(String d){
		List<RegisterModel> l=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", 
					"root","akki1312");
			PreparedStatement ps=con.prepareStatement("select *from clgstudent where branch=?");
			ps.setString(1, d);
			
			ResultSet rs=ps.executeQuery();
			
			l=new ArrayList();
			while(rs.next()) {
				RegisterModel rm=new RegisterModel();
				rm.setId(rs.getInt("id"));
				rm.setSname(rs.getString("sname"));
				rm.setSemail(rs.getString("semail"));
				rm.setPhone(rs.getString("gender"));
				rm.setAd(rs.getString("ad"));
				rm.setGender(rs.getString("phone"));
				
				l.add(rm);
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();;
		}
		return l;
	}
}
