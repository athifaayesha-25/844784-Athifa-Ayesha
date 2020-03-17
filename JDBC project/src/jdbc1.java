import java.sql.*;
public class jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String url="jdbc:mysql://localhost:3306/mydbjdbc";
		String username="root";
		String password="athifa@123";
		String sql1="create table emplo(emp_id smallint not null primary key,emp_name varchar(30))";
		//String sql2="insert into emplo values('3','athifa');";
		String sql="select * from emplo";
		//String sql6="insert into emplo(emp_id,emp_name) values(?,?)";
		String sql3="delete from emplo where emp_id=?;";
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		//st.executeUpdate(sql3);
		//st.executeUpdate(sql2);
		//st.executeUpdate(sql1);
		//system.out.println("TABLE CREATED");
		//System.out.println("INSERTED");
		//ResultSet rs=st.executeQuery(sql);
		//while(rs.next())
		//{
			//System.out.println(rs.getInt(1)+" "+rs.getString(2));
		//}
		//PreparedStatement pstmt=con.prepareStatement(sql6);
		PreparedStatement pstmt=con.prepareStatement(sql3);
		pstmt.setInt(1,2002);
		//pstmt.setString(2, "rtm");
		pstmt.executeUpdate();
		pstmt.close();
		//st.close();
		//con.close();
		
		

	}

}
