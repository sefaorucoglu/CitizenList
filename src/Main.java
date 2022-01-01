import java.sql.Connection;
import java.sql.DriverManager;

public class  Main {
    public static void main(String[] args) {
        class Connect extends SQLConfig{
            private Connection con =null;
            public void MakeDBConnection(){
                String url="jdbc:mysql://" + getHost() + ":" + getPort()+ "/" + getDBİD();

                try{
                    Class.forName("com.mysql.jdbc.Driver");
                }catch(ClassNotFoundException ex){
                    System.out.println("Driver Not Found!");

                }
                try {
                    con= DriverManager.getConnection(url, getUsername(),getPassword());
                    System.out.println("DB Connection Successful");

                } catch (Exception e) {
                    System.out.println("DB Connection Not Successful");

                }

            }
        }
        Connect connect = new Connect();
        connect.MakeDBConnection();




    }
    }

