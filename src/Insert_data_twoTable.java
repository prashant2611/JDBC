import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_data_twoTable {

	public static void main(String[] args) {
    
		int ccode;
		String cname,cadd,name,branch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of Student:");
		name=sc.next();
		System.out.println("Enter name of college:");
		cname=sc.next();
		System.out.println("Enter college code:");
		ccode=sc.nextInt();
		System.out.println("Enter college address:");
		cadd=sc.next();
		System.out.println("Enter branch:");
		branch=sc.next();

		String sql1="insert into college values("+ccode+",'"+cname+"','"+cadd+"')";
		String sql2="insert into rough values("+ccode+",'"+name+"','"+branch+"')";
		
		Connection con;
		Statement st;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		st=con.createStatement();
		st.execute(sql1);
		st.execute(sql2);
		System.out.println("Done!");
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
