package verify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRetriever {
    private static final String DB_URL = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

    public UserAdd getEmployeeByIndex(int index) {
        String selectQuery = "SELECT Name, Email, Adress, PhoneNumber, Dob, gender, DateOfJoin, Rating, Status, TaxiID FROM Employee";
        UserAdd employee = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection connection = DriverManager.getConnection(DB_URL);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                // Move the cursor to the specified index
                for (int i = 0; i <= index; i++) {
                    if (!resultSet.next()) {
                        throw new SQLException("Index out of bounds");
                    }
                }

                // Retrieve the employee data
                employee = new UserAdd(
                    resultSet.getString("Name"),
                    resultSet.getString("Email"),
                    resultSet.getString("Adress"),
                    resultSet.getLong("PhoneNumber"),
                    resultSet.getString("Dob"),
                    resultSet.getString("gender")
                );
                employee.setDateOfJoin(resultSet.getString("DateOfJoin"));
                employee.setRating(resultSet.getString("Rating"));
                employee.setStatus(resultSet.getString("Status"));
                employee.setTaxiID(resultSet.getString("TaxiID"));

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return employee;
    }

    // Method to count the number of rows in the Employee table
    public int getEmployeeRowCount() {
        String countQuery = "SELECT COUNT(*) AS rowcount FROM Employee";
        int rowCount = 0;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection connection = DriverManager.getConnection(DB_URL);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(countQuery)) {

                if (resultSet.next()) {
                    rowCount = resultSet.getInt("rowcount");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return rowCount;
    }
}
