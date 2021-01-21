import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Display_data_twoTable {

	public static void main(String[] args) {
    
		String sql1="select * from college";
		String sql2="select * from rough";
		
		Connection con;
		Statement st;
		ResultSet rs;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		st=con.createStatement();
		rs=st.executeQuery(sql1);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getNString(3));
		}
		rs.close();
		System.out.println("--------------------------------------------");
		rs=st.executeQuery(sql2);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getNString(3));
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
