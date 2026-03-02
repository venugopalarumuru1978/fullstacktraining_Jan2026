package jdbc_pack;
import java.sql.*;
;
public class TestConnection {

	public static void main(String[] args) throws SQLException {
		try {
			//Class.forName("Drivername");
			//Connection  conObj =  DriverManager.getConnection("connectionString","username", "password");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  conObj =  DriverManager.getConnection("jdbc:mysql://localhost:3306/FEB26JAVAFSDDB","root", "root");
			if(conObj!=null)
				System.out.println("Db Connected...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}

//INSERT INTO STUDENT(ROLLNO, SNAME, COURSE, FEES) VALUES(101, 'NAGINI', 'JAVA', 20000.00);