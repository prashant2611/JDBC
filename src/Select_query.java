

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_query {

	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		st=con.createStatement();
		rs=st.executeQuery("select * from emp ");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getDate(5)+" "+rs.getInt(6));
		}
		rs.close();
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
