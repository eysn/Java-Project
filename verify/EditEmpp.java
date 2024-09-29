package verify;
import form.FormEditE;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EditEmpp {
	public boolean isUserExists(String email) {
	    boolean userExists = true;
	    String dbUrl = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";
       
	    try (Connection connection = DriverManager.getConnection(dbUrl);
	            Statement statement = connection.createStatement()) {

	           String query = "SELECT COUNT(*) as count FROM Employee WHERE Email = '" + email + "'";
	           ResultSet resultSet = statement.executeQuery(query);

	           if (resultSet.next()) {
	               int count = resultSet.getInt("count");
	               if (count > 0) {
	                   userExists = true;
	               }
	           }
	       } catch (SQLException e) {
	           e.printStackTrace();
	       }
	       return userExists;
	   } 

	public boolean updateEmployeeByEmail(String oldEmail, UserAdd newEmployee) {
            String dbUrl = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";
        String searchQuery = "SELECT * FROM Employee WHERE Email = ?";
        String updateQuery = "UPDATE Employee SET Name = ?, Address = ?, Dob = ?, PhoneNumber = ?, Email = ?, Gender = ? WHERE Email = ?";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection connection = DriverManager.getConnection(dbUrl);
                 PreparedStatement searchStmt = connection.prepareStatement(searchQuery);
                 PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {

                // Search for the employee by email
                searchStmt.setString(1, oldEmail);
                ResultSet resultSet = searchStmt.executeQuery();

                if (resultSet.next()) {
                    // Employee found, update the details
                    updateStmt.setString(1, newEmployee.getName());
                    updateStmt.setString(2, newEmployee.getAddress());
                    updateStmt.setString(3, newEmployee.getDob());
                    updateStmt.setLong(4, newEmployee.getPhoneNumber());
                    updateStmt.setString(5, newEmployee.getEmail());
                    updateStmt.setString(6, newEmployee.getGender());
                    updateStmt.setString(7, oldEmail);

                    int rowsUpdated = updateStmt.executeUpdate();
                    return rowsUpdated > 0;
                } else {
                    System.out.println("Employee with email " + oldEmail + " not found.");
                    return false;
                }

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
