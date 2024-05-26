package jdbc;
import java.sql.*;
public class myclass {
public static void main(String args[]) throws Exception{
	String url="jdbc:mysql://localhost:3306/mydb";
	String username="root";
	String password="1234";
	String query="select name from xyz where id=2";
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,username,password);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
rs.next();
String name=rs.getString("name");
System.out.println(name);
st.close();
con.close();
}
}