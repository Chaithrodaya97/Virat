package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcexample3 {

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
		Statement st = con.createStatement();
		//Step4: Execute Queries
		String sql = "insert into product values('AC',8,25000)";
		int result = st.executeUpdate(sql);
		if(result==0)
		{
			System.out.println("Insertion Failed");
		}
		else
		{
			System.out.println("insertion Successful");
		}
		//Step5: Class Connection
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}



