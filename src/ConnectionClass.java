
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md. Iqbal Hossain
 */
public class ConnectionClass {
 public Connection connection;
    public PreparedStatement ps;
    public ResultSet rs;

    /**
     *
     */
    public ConnectionClass()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }

    public Connection getConnection()
    {
        String url = "jdbc:mysql://localhost:3306/practice";

        try
        {
           connection = DriverManager.getConnection(url, "root", "");
            System.out.println("Database Connected");
            //connection = DriverManager.getConnection(url,"root","");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
}
