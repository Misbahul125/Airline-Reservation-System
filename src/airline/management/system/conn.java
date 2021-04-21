package airline.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            // LOAD THE DRIVER CLASS
            //Class.forName("com.mysql.jdbc.Driver");  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            
            // CREATE THE CONNECTION OBJECT
            c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","oracle"); 
            
            // CREATE THE STATEMENT OBJECT
            s =c.createStatement(); 
            
            //System.out.println("Sucessful");
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }
}  