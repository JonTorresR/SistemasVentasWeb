package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOME
 */
public class Conexion {

   Connection con;
   String url = "jdbc:mysql://localhost:3306/bd_ventas";
   String user ="root";
   String pass ="";
   public Connection Conexion(){
      try{
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection(url,user,pass);
      } catch (Exception e){
      }
        
        
      return con;
   }

 
}
