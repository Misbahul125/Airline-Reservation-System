package airline.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            //Class.forName("com.mysql.jdbc.Driver");  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            c = DriverManager.getConnection("jdbc:orale:thin:@localhost:1521:xe","System","oracle");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  