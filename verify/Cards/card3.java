
package verify.Cards;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class card3 {
    private static final String DB_URL = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

    private String latestTaxiModel;
    private String latestTaxiID;

    public void fetchLatestTaxi() {
        String selectQuery = "SELECT TaxiID, Model FROM Taxi ORDER BY Year DESC";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection connection = DriverManager.getConnection(DB_URL);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                if (resultSet.next()) {
                    this.latestTaxiID = resultSet.getString("TaxiID");
                    this.latestTaxiModel = resultSet.getString("Model");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getLatestTaxiModel() {
        return latestTaxiModel;
    }

    public String getLatestTaxiID() {
        return latestTaxiID;
    }
}

    

