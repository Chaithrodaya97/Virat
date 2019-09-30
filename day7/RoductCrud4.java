package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RoductCrud4 {
public void getProduct(int productId) {
	try {
		// Step 1:Register the Driver class
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver is loaded");

		// Step 2:Create connection
		String url = "jdbc:mysql://localhost:3306/java";

		String userName = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("connection: "+con);

		// Step 3:Create statement
		Statement st = con.createStatement();

		// Step 4:Execute queries
		String sql = "select * from product where productId="+productId+"";
		ResultSet rs= st.executeQuery(sql);
		
		
		rs.absolute(1);  
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		
		// Step 5:Close connection

		con.close();
	}
	catch(Exception e) {
		
	}
}
}
