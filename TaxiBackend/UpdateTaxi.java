
    package TaxiBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateTaxi {
    private static final String DB_URL = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

    public boolean updateTaxi(String oldTaxiID, AddTaxi newTaxi) {
        String searchQuery = "SELECT * FROM Taxi WHERE TaxiID = ?";
        String updateQuery = "UPDATE Taxi SET TaxiID = ?, Capacity = ?, Model = ?, Year = ? WHERE TaxiID = ?";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection connection = DriverManager.getConnection(DB_URL);
                 PreparedStatement searchStmt = connection.prepareStatement(searchQuery);
                 PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {

                // Search for the taxi by old TaxiID
                searchStmt.setString(1, oldTaxiID);
                ResultSet resultSet = searchStmt.executeQuery();

                if (resultSet.next()) {
                    // Taxi found, update the details
                    updateStmt.setString(1, newTaxi.getTaxiID());
                    updateStmt.setInt(2, newTaxi.getCapacity());
                    updateStmt.setString(3, newTaxi.getModel());
                    updateStmt.setInt(4, newTaxi.getYear());
                    updateStmt.setString(5, oldTaxiID);

                    int rowsUpdated = updateStmt.executeUpdate();
                    return rowsUpdated > 0;
                } else {
                    System.out.println("Taxi with ID " + oldTaxiID + " not found.");
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

    

