import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Connect connect1 = new Connect();
        connect1.MakeDBConnection();
        readCSV();

    }
    static class Connect extends SQLConfig {
        private Connection con = null;

        public void MakeDBConnection() {
            String url = "jdbc:mysql://" + getHost() + ":" + getPort() + "/" + getDBİD();

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Driver Not Found!");

            }
            try {
                con = DriverManager.getConnection(url, getUsername(), getPassword());
                System.out.println("DB Connection Successful");

            } catch (Exception e) {
                System.out.println("DB Connection Not Successful");

            }

        }
    }
     static String[] info_array;
    public static void readCSV() {
         int used=1;
         int is_used=1;

        try (Scanner scanner1 = new Scanner(new FileReader("citizenList.csv"))) {
            do {
                String citizen_info = scanner1.nextLine();
                info_array = citizen_info.split(",");
            }while(is_used<used && scanner1.hasNextLine());


        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Somethink went wrong when file opening!");
        }

    }
    public static void addDataToDB(){



    }

}

