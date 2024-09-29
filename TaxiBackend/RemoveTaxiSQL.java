
package TaxiBackend;

    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveTaxiSQL {



    public void deleteTaxiById(String taxiID) {
        // Database connection details
        String dbUrl = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";
        
        // SQL DELETE statement
        String sql = "DELETE FROM Taxi WHERE TaxiID = ?";

        try (Connection connection = DriverManager.getConnection(dbUrl);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            // Set the TaxiID parameter
            pstmt.setString(1, taxiID);

            // Execute the DELETE statement
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The row was deleted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    

