package day7;

import java.sql.Connection;
import java.sql.DriverManager;

//connecting to product table in product db
public class jdbcexample1 {

	public static void main(String[] args) 
	{
		try
		{
		
		//Step1: Register the driver class
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver is loaded successfully");
		//Step2: Create connection
		
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