package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeSQL {
    public void updateEmployeeInDatabase(Employee employee, String email) {
        // Database connection details
                
    String dbUrl = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

        // SQL UPDATE statement
        String sql = "UPDATE employee SET name = ?, phone = ?, adress = ?, gender = ?, Dob = ?, email = ? WHERE email = ?";

        try (Connection conn = DriverManager.getConnection(dbUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set the values for the update
            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getPhone());
            pstmt.setString(3, employee.getAdress());
            pstmt.setString(3, employee.getGender());
            pstmt.setString(4, employee.getdob());            
            pstmt.setString(5, employee.getNEmail());
            pstmt.setString(6, email);
            // Execute the UPDATE statement
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("The row was updated successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
