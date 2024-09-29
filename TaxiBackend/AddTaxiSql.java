
package TaxiBackend;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddTaxiSql {
   

    public void insertTaxiIntoDatabase(AddTaxi taxi) {
        // Database connection details
       String DbUrl = "jdbc:sqlserver://LENO\\SQLEXPRESS;databaseName=Adminstors;integratedSecurity=true;encrypt=false;portNumber=1433";

        // SQL INSERT statement
        String sql = "INSERT INTO Taxi (TaxiID, Capacity, Model, Year) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DbUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Set the values for the new row from the Taxi object
            pstmt.setString(1, taxi.getTaxiID());
            pstmt.setInt(2, taxi.getCapacity());
            pstmt.setString(3, taxi.getModel());
            pstmt.setInt(4, taxi.getYear());

            // Execute the INSERT statement
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new row was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


/*
Sure! Let’s dive deeper into the DriverManager and PreparedStatement classes, explaining their roles and purposes in detail.

DriverManager
Purpose:
DriverManager is a class in the Java Database Connectivity (JDBC) API that is responsible for managing the different database drivers. It acts as a factory for creating Connection objects, which are necessary to interact with a database.

How It Works:
Driver Registration:
When you load a JDBC driver (either explicitly or automatically), it registers itself with the DriverManager. This is often done using Class.forName("driverClassName"), although modern JDBC drivers often register themselves automatically.
Establishing a Connection:
To connect to a database, you use the DriverManager.getConnection() method, passing in a database URL (like your DbUrl).
DriverManager checks the registered drivers to find a suitable one that can connect to the specified database.
Connection Creation:
Once a suitable driver is found, DriverManager uses it to create a Connection object, which represents a session with the database.
Example in Your Code:
java

Copy
Connection conn = DriverManager.getConnection(DbUrl);
This line calls the getConnection() method with your database URL (DbUrl). If successful, it returns a Connection object (conn) that you can use to perform SQL operations.
PreparedStatement
Purpose:
PreparedStatement is an interface that allows you to execute parameterized SQL queries. It is a subclass of Statement that provides methods for setting parameters in the SQL statement.

Advantages:
Precompiled SQL:
When you create a PreparedStatement, the SQL query is precompiled once. This means that the database can optimize the execution plan, which can improve performance, especially when executing the same query multiple times with different parameters.
Parameter Binding:
PreparedStatement allows you to use placeholders (?) in your SQL statements. You can then set values for these placeholders dynamically using setter methods (like setString, setInt, etc.). This prevents SQL injection attacks, as the input is treated as data, not executable code.
Ease of Use:
Using PreparedStatement makes your code cleaner and easier to read by separating the SQL logic from the data being passed into it.
Example in Your Code:
java

Copy
String sql = "INSERT INTO Taxi (TaxiID, Capacity, Model, Year) VALUES (?, ?, ?, ?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
Here, you prepare an SQL INSERT statement with placeholders for the values you want to insert.
Setting Parameters:
java

Copy
pstmt.setString(1, taxi.getTaxiID());
pstmt.setInt(2, taxi.getCapacity());
pstmt.setString(3, taxi.getModel());
pstmt.setInt(4, taxi.getYear());
Each setX() method corresponds to a placeholder in the SQL string, allowing you to specify the actual values to be inserted into the database.
Executing the Statement:
java

Copy
int rowsInserted = pstmt.executeUpdate();
This line executes the prepared statement. The executeUpdate() method returns the number of rows affected by the statement (in this case, the number of rows inserted).
Summary
DriverManager:
Manages database drivers and establishes connections to the database. It simplifies the process of connecting to different types of databases.
PreparedStatement:
Allows for the execution of precompiled SQL statements with parameters. It offers performance benefits and enhances security by preventing SQL injection attacks.
By using these two components effectively, your code can safely and efficiently interact with a database. 


Understanding the Parameters
In your SQL statement, you have the following:

sql

Copy
String sql = "INSERT INTO Taxi (TaxiID, Capacity, Model, Year) VALUES (?, ?, ?, ?)";
This statement has four placeholders (?), which correspond to the four columns in the Taxi table: TaxiID, Capacity, Model, and Year.

Setting Parameters in PreparedStatement
When you create a PreparedStatement, you set values for these placeholders using methods like setString() and setInt(). The numbers you pass to these methods (e.g., 1, 2, 3, 4) correspond to the position of the placeholders in the SQL statement.

Parameter Mapping
Here’s how the mapping works:

pstmt.setString(1, taxi.getTaxiID());
This sets the value for the first placeholder (?) in the SQL statement, which corresponds to TaxiID.
pstmt.setInt(2, taxi.getCapacity());
This sets the value for the second placeholder (?), corresponding to Capacity.
pstmt.setString(3, taxi.getModel());
This sets the value for the third placeholder (?), corresponding to Model.
pstmt.setInt(4, taxi.getYear());
This sets the value for the fourth placeholder (?), corresponding to Year.


// SQL INSERT statement with placeholders
String sql = "INSERT INTO Taxi (TaxiID, Capacity, Model, Year) VALUES (?, ?, ?, ?)";

// Preparing the statement
PreparedStatement pstmt = conn.prepareStatement(sql);

// Setting parameters
pstmt.setString(1, taxi.getTaxiID());   // 1st placeholder: TaxiID
pstmt.setInt(2, taxi.getCapacity());     // 2nd placeholder: Capacity
pstmt.setString(3, taxi.getModel());     // 3rd placeholder: Model
pstmt.setInt(4, taxi.getYear());         // 4th placeholder: Year

// Execute the INSERT statement
int rowsInserted = pstmt.executeUpdate();




It's checked::::::::::
SQLException is a checked exception, which means it must be handled in your code.
Its severity can vary based on the specific database operation and the error encountered.
Understanding how to handle it effectively is crucial for robust database interactions in your applications.

*/


