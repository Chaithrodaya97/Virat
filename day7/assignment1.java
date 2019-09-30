package day7;

import java.sql.*;
public class assignment1 {

	public void deleteProduct(int productId)
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
	
			
			String sql="delete from  product where productId="+productId;
			System.out.println(sql);
			PreparedStatement pst = con.prepareStatement(sql);
			int result = pst.executeUpdate(sql);
			if(result==0)
			{
				System.out.println("Deletion Failed");
			}
			else
			{
				System.out.println("Deletion Successful");
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


