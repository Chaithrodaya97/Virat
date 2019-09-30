package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class roductcrud5 {
public void getProduct() {
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
		String sql = "select * from product";
		ResultSet rs= st.executeQuery(sql);
		if(rs.next()) 
		{
			do 
			{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			while(rs.next());
		}
		
		else
		{
			System.out.println("not ");
		}
	
		
		// Step 5:Close connection

		con.close();
	}
	catch(Exception e) {
		
	}
}
}
