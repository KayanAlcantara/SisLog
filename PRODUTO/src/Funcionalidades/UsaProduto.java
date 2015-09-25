package Funcionalidades;

import java.text.*;
import java.util.*;
public class UsaProduto {

    public static void cadastrarProduto() {
        String nome, data, fornecedor;
        int codigo, matricula, quantidade;
        ProdutoPersiste produto = new ProdutoPersiste();

        System.out.println("Produto:");
        nome = Utilidades.lerString();
        produto.setNome(nome);

        System.out.println("Código:");
        codigo = Utilidades.lerInt();
        produto.setCodigo(codigo);

        System.out.println("Matricula do funcionário:");
        matricula = Utilidades.lerInt();
        produto.setMatricula(matricula);

        System.out.println("Fornecedor:");
        fornecedor = Utilidades.lerString();
        produto.setFornecedor(fornecedor);

        System.out.println("Quantidade:");
        quantidade = Utilidades.lerInt();
        produto.setQuantidade(quantidade);

        SimpleDateFormat hoje = new SimpleDateFormat("dd/MM/yyyy "+"HH:mm:ss");
        data = hoje.format(new Date()); 
        produto.setData(data);

        System.out.println(produto.gravar());

    }
    
    public static void cadastrarRequisicao() throws ParseException{
        
        String nome, data;
        int matricula, quantidade;
        ProdutoPersiste produto = new ProdutoPersiste();
        
        System.out.println("Produto:");
        nome = Utilidades.lerString();
        produto.setNome("comprar" + nome);

        System.out.println("Matricula do funcionário:");
        matricula = Utilidades.lerInt();
        produto.setMatricula(matricula);

        System.out.println("Quantidade:");
        quantidade = Utilidades.lerInt();
        produto.setQuantidade(quantidade);
       
        SimpleDateFormat hoje = new SimpleDateFormat("dd/MM/yyyy "+"HH:mm:ss");
        data = hoje.format(new Date()); 
        produto.setData(data);
        
        System.out.println(produto.gravar());
    }
}
