package src.ProvinceInfo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Covid19app {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=CovidStats";
        String username = "LAPTOP-CIUFQHOV";
        String password = "";
        try {
            // Registering the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establishing a database connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a SQL query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM StatsInfo");

            // Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("ProvId");
                String Prov = resultSet.getString("provinceName");
                int totalcases = resultSet.getInt("TotalCases");
                BigDecimal perctotal = resultSet.getBigDecimal("PercentageTotal");

                ProvinceInfo stats = new ProvinceInfo(id, Prov, totalcases, perctotal);
                System.out.println("ID: " + id);
                System.out.println("Province: " + Prov);
                System.out.println("Total Cases: " + totalcases);
                System.out.println("Total Percentage: " + perctotal);
                System.out.println(stats);
            }

            // Close the resources

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error while connecting to the SQL Server database.");
            e.printStackTrace();
        }
    }
}
