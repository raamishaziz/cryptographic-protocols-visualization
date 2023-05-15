package crypto.tool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		ConnectionToDB conToDb = new ConnectionToDB();
		try {
			con = conToDb.getConnection();
			if (null != con) {
				Statement stmt= con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from users");  
				while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				con.close();  
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

}
