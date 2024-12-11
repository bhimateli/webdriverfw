package util;

import java.sql.*;

public class DButil {

    public String connectDB(String query) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/table_name"; // table details
        String username = "rootgfg"; // MySQL credentials
        String password = "gfg123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection( url, username, password);
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
    return query;
    }


    String driver = "com.sqpl.jdbc.Driver";
    String connectionString = "jdbc:mysql:/localhost:443";
    String userName = "bteli";
    String password = "xbg7";


    public void fetchDbValues(String query) throws SQLException, ClassNotFoundException {

        Class.forName(driver);
        Connection con = DriverManager.getConnection(connectionString, userName, password);
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {

            System.out.println("The values from the DB is" + rs.getInt(1));

        }
    }

}
