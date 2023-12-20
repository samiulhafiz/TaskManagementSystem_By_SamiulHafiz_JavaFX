package Taskmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author samiu
 */
public class database {
    
    public static Connection connectDB(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/taskmanagement", "root", "");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
