import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class Delete_data {

	public static void main(String[] args) {
		int eid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID:");
		eid=sc.nextInt();
		String sql="delete from emp where eid="+eid;
		
		Connection con;
		Statement st;
        try
        {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		st=con.createStatement();
		if(st.executeUpdate(sql)>0)
		{
			System.out.println("Delete successfully.");
		}
		else
		{
			System.out.println("Invalid employee ID.");
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
