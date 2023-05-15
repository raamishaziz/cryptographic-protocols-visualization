package crypto.tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import crypto.utils.Constants;

public class ConnectionToDB {

	public Connection getConnection () throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName(Constants.driver);  
		con= DriverManager.getConnection(Constants.url,Constants.user,Constants.password);  
		return con;
	}
}
