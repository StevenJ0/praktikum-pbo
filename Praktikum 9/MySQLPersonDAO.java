// Nama      : Steven Jonathan Sihombing
// NIM       : 24060123120044


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LENOVO
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person p) throws Exception {
        String name = p.getName();
        
//        Create connection
//         using the new driven class
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
         
         String query = "INSERT INTO person(name) VALUES ('" + name + "')";
         System.out.println(query);
         java.sql.Statement s = con.createStatement();
         s.executeUpdate(query);
         
         con.close();
    }
}