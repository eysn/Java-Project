package verify.Cards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class card2 {
    private static final String DB_URL = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

    private String latestEmployeeName;
    private LocalDate latestEmployeeDateOfJoin;

    public void fetchLatestJoiningEmployee() {
        String selectQuery = "SELECT Name, DateOfJoin FROM Employee ORDER BY DateOfJoin DESC";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection connection = DriverManager.getConnection(DB_URL);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                if (resultSet.next()) {
                    this.latestEmployeeName = resultSet.getString("Name");
                    this.latestEmployeeDateOfJoin = LocalDate.parse(resultSet.getString("DateOfJoin"), DateTimeFormatter.ISO_DATE);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getLatestEmployeeName() {
        return latestEmployeeName;
    }

    public LocalDate getLatestEmployeeDateOfJoin() {
        return latestEmployeeDateOfJoin;
    }
}
