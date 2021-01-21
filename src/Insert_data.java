
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_data {

	public static void main(String[] args) {
		int ccode;
		String cname,cadd;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter college code:");
		ccode=sc.nextInt();
		System.out.println("Enter college name:");
		cname=sc.next();
		System.out.println("Enter college address:");
		cadd=sc.next();
		
		String sql="insert into college values("+ccode+",'"+cname+"','"+cadd+"')";
		
		Connection con;
		Statement st;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Done!");
		st.close();
		con.close();
		sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
