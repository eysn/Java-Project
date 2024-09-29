package TaxiBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TaxiView {
    // Method to get the row count of the Taxi table
    public int getTaxiRowCount() {
        int rowCount = 0;

        // Database connection details
        String DbUrl = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

        // SQL COUNT statement
        String sql = "SELECT COUNT(*) AS rowcount FROM Taxi";

        try (Connection conn = DriverManager.getConnection(DbUrl);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Retrieve the row count
            if (rs.next()) {
                rowCount = rs.getInt("rowcount");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowCount;
    }

    // Method to get a Taxi by index
    public AddTaxi getTaxiByIndex(int index) {
        AddTaxi taxi = new AddTaxi();

        // Database connection details
      String DbUrl = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

        // SQL SELECT statement
        String sql = "SELECT * FROM Taxi";

        try (Connection conn = DriverManager.getConnection(DbUrl);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Move the cursor to the specified index
            for (int i = 0; i <= index; i++) {
                if (!rs.next()) {
                    throw new SQLException("Index out of bounds");
                }
            }

            // Set the values for the taxi object
            taxi.setTaxiID(rs.getString("TaxiID"));
            taxi.setCapacity(rs.getInt("Capacity"));
            taxi.setModel(rs.getString("Model"));
            taxi.setYear(rs.getInt("Year"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return taxi;
    }


}
