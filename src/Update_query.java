
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update_query {

	public static void main(String[] args) {
	Connection con;
	Statement st;
	Scanner sc=new Scanner(System.in);
	int eid,amt;
	System.out.println("Enter the employee ID:");
	eid=sc.nextInt();
	System.out.println("Enter amount:");
	amt=sc.nextInt();
	String sql="update emp set sal=sal-"+amt+" where eid="+eid ;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
	st=con.createStatement();
	int flag=st.executeUpdate(sql);
	if(flag>0)
	{
		System.out.println("Update successfully.");
	}
	else
	{
		System.out.println("Invalid empID.");
	}
	
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

