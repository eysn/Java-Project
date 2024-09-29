
package verify.Cards;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class card1 {
    private static final String DB_URL = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

    private String highestRatedEmployeeName;
    private double highestRatedEmployeeRating;

    public void fetchEmployeeWithHighestRating() {
        String selectQuery = "SELECT Name, Rating FROM Employee";
        double highestRating = Double.MIN_VALUE;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection connection = DriverManager.getConnection(DB_URL);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                while (resultSet.next()) {
                    double rating = resultSet.getDouble("Rating");
                    if (rating > highestRating) {
                        highestRating = rating;
                        this.highestRatedEmployeeName = resultSet.getString("Name");
                        this.highestRatedEmployeeRating = rating;
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getHighestRatedEmployeeName() {
        return highestRatedEmployeeName;
    }

    public double getHighestRatedEmployeeRating() {
        return highestRatedEmployeeRating;
    }
}
