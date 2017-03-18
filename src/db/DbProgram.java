package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class DbProgram {
	
	@Test
	public void testDbProgram(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bitnami_orangehrm","root","manager");
			Statement stmt=c.createStatement();
			ResultSet rs=stmt.executeQuery("select emp_firstname FROM hs_hr_employee");
			while(rs.next()){
				Reporter.log(rs.getString(1),true);
			}
		}
		catch(Exception e){
	      e.printStackTrace();
		}
	    
	    
	}
	

}
