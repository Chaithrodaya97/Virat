package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

//connecting to product table in product db
public class jdbcexample5 {

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
	    //Step3: Create PreparedStatement
		Statement st = con.createStatement();
		//Step4: Execute Queries
		String productName="Washer";
		int productId=11;
		int price=5000;
		
		String sql="insert into product values('"+productName+"',"+productId+","+price+")";
		System.out.println(sql);
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

