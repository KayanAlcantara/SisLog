package Funcionalidades;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Rafael Oliveira
 * @version 1.0
 */
public class clsDataHora {
    public String MostraData(){
       //pega data do computador
       Date data = new Date();
       //cria o formatador
       SimpleDateFormat dformatador = new SimpleDateFormat("dd/MM/yyyy");
       // cria a string para armazenar data
       String sData = dformatador.format(data);

       //retorna o pedido
        return sData;
    }
    public String MostraHora(){
       //pega data para converter em horas
       Date data = new Date();
       //cria o formatador
       SimpleDateFormat hformatador = new SimpleDateFormat("hh:mm:ss");
       // cria a string
       String sHora = hformatador.format(data);
       return sHora;
    }
}