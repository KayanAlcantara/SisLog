package Funcionalidades;

import java.io.*;

public class ProdutoPersiste extends Produto {

    public String gravar() {
        String ret = "Produto armazenado com sucesso!";
        // sucesso
        try {
            FileOutputStream file;
            file = new FileOutputStream(this.getNome());
            //abre
            ObjectOutputStream stream = new ObjectOutputStream(file);
            //grava
            stream.writeObject(this);
            //limpa memoria
            stream.flush();
        } //erro(pode haver varios tratamenos de erros, mas apenas um try)
        catch (Exception erro) {
            ret = "Falha na gravação\n " + erro.toString();
        }
        return ret;
    }

    public static Produto ler(String descricao) {
        try {
            FileInputStream file = new FileInputStream(descricao);
            ObjectInputStream stream = new ObjectInputStream(file);
            return ((Produto) stream.readObject());
        } catch (Exception erro) {
            System.out.println("Falha na leitura\n " + erro.toString());
            return null;
        }
    }
}
