package jdbc_pack;
import java.sql.*;
public class ViewAllRows {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  conObj =  DriverManager.getConnection("jdbc:mysql://localhost:3306/FEB26JAVAFSDDB","root", "root");

			Statement  stmt = conObj.createStatement();			
			ResultSet res =	stmt.executeQuery("select * from student");
			
			while(res.next())
			{
				System.out.println(res.getInt("rollno") + "\t" + res.getString("sname") + "\t" + res.getString("course") + "\t" + res.getFloat("fees"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}