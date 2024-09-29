package Checker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxiIDChecker {

    private static final String DB_URL = "jdbc:sqlserver://your_server;databaseName=your_database";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public static boolean isTIDTaken(String taxiID) {
        String query = "SELECT COUNT(*) FROM your_table WHERE taxi_id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, taxiID);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
