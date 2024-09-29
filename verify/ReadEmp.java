package verify;

import verify.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

//this is the sql handler
public class ReadEmp {
    private static final String URL = "jdbc:mssql://localhost:3306";
    private static final String USER = "SA";
    private static final String PASSWORD = "1234567890ABCD";

    //get employee by row number
    public Employee getEmployeeByRowNumber(int rowNumber) {
    String employeeQuery = "SELECT name, email, phoneNumber, gender, dateOfBirth, status, rating, dateJoined, employeeId FROM Employee LIMIT ?, 1";
    String taxiQuery = "SELECT taxiId FROM Taxi WHERE employeeId = ?";
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement employeeStatement = connection.prepareStatement(employeeQuery);
         PreparedStatement taxiStatement = connection.prepareStatement(taxiQuery)) {
        employeeStatement.setInt(1, rowNumber - 1); // MySQL row number starts from 0
        ResultSet employeeResultSet = employeeStatement.executeQuery();
        if (employeeResultSet.next()) {
            String name = employeeResultSet.getString("name");
            String email = employeeResultSet.getString("email");
            String phoneNumber = employeeResultSet.getString("phoneNumber");
            String gender = employeeResultSet.getString("gender");
            String dateOfBirth = employeeResultSet.getDate("dateOfBirth").toString();
            String status = employeeResultSet.getString("status");
            String rating = Double.toString(employeeResultSet.getDouble("rating"));
            String dateJoined = employeeResultSet.getDate("dateJoined").toString();
            String age = Integer.toString(Period.between(LocalDate.parse(dateOfBirth), LocalDate.now()).getYears());

            // Fetch taxiId
            int employeeId = employeeResultSet.getInt("employeeId");
            taxiStatement.setInt(1, employeeId);
            ResultSet taxiResultSet = taxiStatement.executeQuery();
            String taxiId = "0";
            if (taxiResultSet.next()) {
                taxiId = Integer.toString(taxiResultSet.getInt("taxiId"));
            }

            return new Employee(name, email, phoneNumber, gender, dateOfBirth, status, rating, dateJoined, age, taxiId);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}

public int getRowCount() {
    String query = "SELECT COUNT(*) FROM Employee";
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement(query);
         ResultSet resultSet = preparedStatement.executeQuery()) {
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}
}
