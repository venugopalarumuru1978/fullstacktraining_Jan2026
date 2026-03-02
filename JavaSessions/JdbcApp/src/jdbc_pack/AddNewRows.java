package jdbc_pack;
import java.sql.*;
public class AddNewRows {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  conObj =  DriverManager.getConnection("jdbc:mysql://localhost:3306/FEB26JAVAFSDDB","root", "root");

			Statement  stmt = conObj.createStatement();			
			stmt.executeUpdate("INSERT INTO STUDENT(ROLLNO, SNAME, COURSE, FEES) VALUES(103, 'Neela veni', 'python', 25000.00)");
			
			System.out.println("Row Inserted");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
