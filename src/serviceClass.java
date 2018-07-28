import java.sql.SQLException;
import jdk.nashorn.internal.ir.CatchNode;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md. Iqbal Hossain
 */
public class serviceClass extends ConnectionClass {
    
    public void insertToDb(String product_name, String cost, String type, String sell)
    {
        this.getConnection();
        String sql = "INSERT INTO product(product_name, cost, type, sell_cost) VALUES (?,?,?,?)";
        try {
           ps = connection.prepareStatement(sql);
           ps.setString(1, product_name);
           ps.setString(2, cost);
           ps.setString(3, type);
           ps.setString(4, sell);
           ps.executeUpdate();
           ps.close();
           
           connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    public String Validate(String name, String Pass) {

        this.getConnection();
        String sql = "select password from user where name=?";
        user uj;

        try
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            uj = new user();


            while (rs.next())
            {

                uj.setPass(rs.getString(1));

            }

            return uj.getPass();


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public void updateTable(String product_name, String cost, String type, String sell_cost)
    {
        this.getConnection();
        String sql = "update product set product_name=?, cost=?, type=? ,sell_cost=?";
    
    
    try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, product_name);
            ps.setString(2, cost);
            ps.setString(3, type);
            ps.setString(4, sell_cost);
            ps.executeUpdate();
            ps.close();
            connection.close();


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    
}

    void deleteData(String product_name) {
         String sql = "select * from 'product' where 'product_name'=?";
         
         try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, product_name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
