import java.sql.Connection;

public class SQLConnection {
 private String ID="root";
 private String password="";
 private String DBİD="CITIZEN";
 private String host ="localhost";
 private int port= 3306;
 private Connection con =null;
 public SQLConnection(){

     String url="jdbc:mysql://" + host + ":" + port + "/" + DBİD;

     try{
         Class.forName("com.mysql.jdbc.Driver")
     }catch(ClassNotFoundException ex){
         System.out.println("Driver Not Found!");

     }



 }
}
