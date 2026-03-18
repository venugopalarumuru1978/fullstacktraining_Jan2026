package coms.DAL;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import coms.beans.Student;

public class StdDAL {

	private DataSource dataSource;
	private JdbcTemplate  jdbcTemp = null;
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemp = new JdbcTemplate(this.dataSource);
		//System.out.println("Db Connected");
	}
	
	public void AddNewStudent(Student std)
	{
		String sqlcmd =  "Insert into Student values(?,?,?,?)";
		jdbcTemp.update(sqlcmd, new Object[] {std.getRollno(), std.getSname(), std.getCourse(), std.getFees()});
		System.out.println("Student is Added...");
	}
	
	public List<Student> ShowAll()
	{
		String sqlcmd =  "Select * from Student";
		List<Student>  stdinfo = jdbcTemp.query(sqlcmd, new BeanPropertyRowMapper(Student.class));
		return stdinfo;
	}
	
	public Student SearchStd(int rno)
	{
		Student  stdinfo = null;
		try {
			String sqlcmd =  "Select * from Student where rollno = ?";
			stdinfo = (Student)jdbcTemp.queryForObject(sqlcmd, new Object[] {rno}, new BeanPropertyRowMapper(Student.class));			
		} catch (Exception e) {
			// TODO: handle exception
			stdinfo = null;
		}
		return stdinfo;
	}
	
	public void DeleteStudent(int rno)
	{
		String sqlcmd =  "Delete from Student where rollno=?";
		jdbcTemp.update(sqlcmd, new Object[] {rno});
		System.out.println("Student is Deleted...");
	}
	
	public void UpdateStudent(Student std)
	{
		String sqlcmd =  "Update Student set sname=? where rollno=?";
		jdbcTemp.update(sqlcmd, new Object[] {std.getSname(), std.getRollno()});
		System.out.println("Student Name is Updated...");
	}
	
}
