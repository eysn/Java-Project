package verify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Remove {

	public int deleteEmployeeByEmail(String email) {
	    int rowsAffected = 0;
	    String dbUrl = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";
	    try (Connection connection = DriverManager.getConnection(dbUrl);
	         PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Employee WHERE Email = ?")) {
	        preparedStatement.setString(1, email);
	        rowsAffected = preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	        System.out.println("SQL Exception: " + e.getMessage());
	        e.printStackTrace();
	    }
	    return rowsAffected;
	}
	  
}
