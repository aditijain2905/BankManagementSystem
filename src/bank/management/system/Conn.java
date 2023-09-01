
package bank.management.system;
import java.sql.*;
public class Conn {
    
    // 5 steps to connect database
    //1) register the driver
    //2)create connection
    //3)creare statement
    //4)execute query
    //5)close connection
    Connection c;
    Statement s;
    public Conn(){
        
        try{
            
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","aditi2905");
            s = c.createStatement();
        }catch(Exception e){
            System.out.print(e);
        }
        
    }
}
