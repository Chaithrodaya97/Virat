package day7;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcexample2 {

	public static void main(String[] args) 
	{
		try
		{
		
		//Step1: Register the driver class
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver is loaded successfully");
		//Step2: Create connection
		String url="jdbc:mysql://localhost:3306/java";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("con:"+con);
	    //Step3: Create statement
		
		//Step4: Execute Queries
		
		//Step5: Class COnnection
		}
		catch(Exception e)
		{
			System.out.println("Driver unloaded");
		}

	}

}


