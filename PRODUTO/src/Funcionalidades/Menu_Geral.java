package Funcionalidades;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;


public class Menu_Geral {
    //classe menu, para estabelecer as opções ao usuário.   
    public static void menu(){
        
        System.out.println("Gestor de Estoque");
        //Faz referência a linha 58.
        System.out.println("0. FIM");
        //Faz referência a classe SistemaDeEntrada.entrada.
        System.out.println("1. Entrada de Produto");
        //Faz referência a classe Requisicao.novoProduto.
        System.out.println("2. Requisição de Produtos");
        //Faz referência a classe Consultar.busca.
        System.out.println("3. Cunsulta de Estoque");
        //Faz referência a classe sistemadesaida.Saida.
        System.out.println("4. Saída de Produto");
        //Faz referência as linhas 38 e 58.
        System.out.println("Opção:");
    }
    
    public static void main(String[] args) throws IOException, ParseException{

        //O uso do int pelas opções serem por numeros.
        int opcao;
        Scanner entrada = new Scanner(System.in);
        //Para exibição de um menu, no mínimo uma vez, usa o do-while.
        do{
            menu();
            opcao = entrada.nextInt();
            //Comando para escolha entre as opções.
            switch(opcao){
                //Instancia SistemaDeEntrada.entrada ().
                case 1:
                    UsaProduto.cadastrarProduto();
                    break;
                //Instancia Requisicao.novoProduto()
                case 2:
                    Requisicao.novoProduto();
                    break;
                //Instancia Consultar.busca()
                case 3:
                    Consulta.consulta();
                    break;
                //Instancia sistemadesaida.Saida()
                case 4:
                    SaidaProduto.saida();
                    break;
                /*Se outra opção que não das supracitadas for selecionada
                 essa mensagem é ativada*/
                default:
                    System.out.println("Opção inválida.");
                    
                case 0:
                    System.out.println("Até mais!");
            }
        //Fechando o laço do-while.    
        } while(opcao != 0);
        
    } 

}
