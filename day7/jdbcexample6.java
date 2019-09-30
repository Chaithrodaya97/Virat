package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
//connecting to database using PreparedStatement
public class jdbcexample6 {

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
		String productName="Fan";
		int productId=101;
		int price=3000;
		
		String sql = "insert into product values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, productName);
		pst.setInt(2, productId);
		pst.setInt(3, price);
		//Step4: Execute Queries
		int result = pst.executeUpdate();
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



