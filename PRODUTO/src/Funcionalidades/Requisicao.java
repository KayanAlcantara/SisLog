
package Funcionalidades;

import java.io.IOException;
import java.text.ParseException;


public class Requisicao {
    
    //METODO QUE ESCREVE DADOS NO ARQ.TXT
   public static void novoProduto() throws IOException, ParseException {
        String nome, opcao;    
        int quantidade;  
        
        //instancia do ProdutoPersist
        ProdutoPersiste produto = new ProdutoPersiste();
       
        System.out.println("digite o produto que deseja:");
        nome = Utilidades.lerString();
        
        //Pesquisa arquivo.txt pelo nome
        Produto pesquisar = ProdutoPersiste.ler(nome); 
        
        if(pesquisar.getNome() == null){
        
            UsaProduto.cadastrarRequisicao();
        
        }else{
        
             System.out.println("Nome: " + pesquisar.getNome());
             System.out.println("Quantidade: " + pesquisar.getQuantidade());
             System.out.println("deseja (cadastrar) um novo produto ou (requisitar) produto existente?");
             opcao = Utilidades.lerString();
                if(opcao.equals("cadastrar")){
                    
                    UsaProduto.cadastrarRequisicao();
                    
                }else if(opcao.equals("requisitar")){
                    
                     System.out.println("digite a quantidade desejada.");
                     quantidade = Utilidades.lerInt();
                    
                        if(quantidade > 0 || quantidade <= pesquisar.getQuantidade()){
                           System.out.println("Requisição de produto cadastrada com sucesso! Aguardando aprovação...");
                           pesquisar.setAprovar(false);
                        }
                        
                    }
            }     
    }
}
