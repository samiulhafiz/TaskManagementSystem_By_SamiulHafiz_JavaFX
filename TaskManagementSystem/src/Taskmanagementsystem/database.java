package Taskmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author samiul
 */
public class database {
    
    public static Connection connectDB(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/taskmanagement", "root", ""); // root is the default username while "" or empty or null is the default password
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
