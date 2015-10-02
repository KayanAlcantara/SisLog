package SISLOGBD;

//conexão com o banco de dados SGE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaBD{
    
    public static Connection conectaBD() throws SQLException, ClassNotFoundException{
    
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/SisLog","root","1234");
         //JOptionPane.showMessageDialog(null, "CONECTADO COM SUCESSO");
         return con;
     }
      catch(SQLException erro){
              JOptionPane.showMessageDialog(null, "FALHA AO CONECTAR COM BANCO");
              
                      }     
        return null;
      
    }
}
