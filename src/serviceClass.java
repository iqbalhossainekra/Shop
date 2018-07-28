import java.sql.SQLException;
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
    
    public void insertToDb(String name, String pass)
    {
        this.getConnection();
        String sql = "INSERT INTO user(name, password) VALUES (?,?)";
        try {
           ps = connection.prepareStatement(sql);
           ps.setString(1, name);
           ps.setString(2, pass);
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

   
    
}
