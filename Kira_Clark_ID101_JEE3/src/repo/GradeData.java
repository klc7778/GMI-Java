package repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.Connect;
import model.Grades;
public class GradeData {
	
	static Connection currentConn = null;
	static ResultSet rs = null;


	public static Grades login(Grades grade) {
		Statement stmt = null;
		String rollno = grade.getRollNo();
		String searchQuery = "select * from student where roll='"  + rollno + "'";

		try {
			currentConn = Connect.getConnection();
			stmt = currentConn.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean userExists = rs.next();
			
			if (!userExists)
			{
				grade.setValid(false);
			}
			else if (userExists)
			{
				int percentage = rs.getInt("percentage");
				int mark1 = rs.getInt("mark1");
				int mark2 = rs.getInt("mark2");
				grade.setMark1(mark1);
				grade.setMark2(mark2);
				grade.setPercent(percentage);
				grade.setValid(true);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return grade;
	}
} 
