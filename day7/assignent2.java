package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class assignent2 {

	public void updateProduct(int productId,String productName,int price)
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

		
		String sql="update product set productName='"+productName+"',"+"set Price="+price+" "+"where productid="+productId+";";
		System.out.println(sql);
		PreparedStatement pst = con.prepareStatement(sql);
		int result = pst.executeUpdate();
		if(result==0)
		{
			System.out.println("Updation Failed");
		}
		else
		{
			System.out.println("Updation Successful");
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


