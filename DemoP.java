import java.sql.*;
import java.util.*;

public class DemoP {
    public static void main(String[] args) throws SQLException {
        String query = "CREATE TABLE Employee (\n" +
                "    empcode INT PRIMARY KEY,\n" +
                "    ename VARCHAR(50),\n" +
                "    empage INT,\n" +
                "    esalary DECIMAL(10,2)\n" +
                ");";
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/employees?user=root&password=Root");
        Statement statement = connection.createStatement();
        // Create a Table Employee
        statement.executeUpdate(query);
        System.out.println("Table Employee reated successfully");
        //Insert data into the table
        String insertData = "INSERT INTO Employee (empcode, ename, empage, esalary)" +
                "VALUES (101, 'Jenny', 25, 10000)," +
                "(102, 'Jacky', 30, 20000)," +
                "(103, 'Joe', 20, 40000)," +
                "(104, 'John', 40, 80000)," +
                "(105, 'Shameer', 25, 90000)";
        statement.executeUpdate(insertData);
        System.out.println("Data inserted into Employee table successfully");


    }
}
