//conexão com o banco de dados SGE
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class conectaBD {
    private final Connection connection; 
    
    public conectaBD() throws ClassNotFoundException, SQLException{
         Class.forName("com.mysql.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost/SGE","root","1234");
         System.out.println("BANCO CONECTADO COM SUCESSO!!");
         
     }
    
    
    public static void main(String[] args) {
        try{
            conectaBD conectaBD = new conectaBD();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("NÃO FOI POSSIVEL ESTABELECER CONEXÇÃO");
        }
    }

}
