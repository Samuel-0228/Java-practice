import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javalab";
        String user = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // this must succeed
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection successful!");
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("DRIVER NOT FOUND – the MySQL JAR is not on the classpath.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Other error (check MySQL running, DB name, user, password).");
            e.printStackTrace();
        }
    }
}