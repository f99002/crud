
package DAL;
import java.sql.*;
import javax.swing.JOptionPane;
public class Connectdb {
   public  static Connection connectdb() throws ClassNotFoundException{
       try{
           Class.forName("org.postgresql.Driver");
           Connection con;
           con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Crud","postgres","pgsa");
          // JOptionPane.showMessageDialog(null, "Подключение к базе данных прошло успешно");
           return con;
       }
       catch(SQLException error){
           JOptionPane.showMessageDialog(null, error);
           return null;
           
       }
   }
        
}
