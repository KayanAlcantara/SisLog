package Funcionalidades;

public class Consulta {

    public static void consulta(){
        String nome;
       
        System.out.println("digite o produto que deseja:");
        nome = Utilidades.lerString();
        Produto p = ProdutoPersiste.ler(nome);
        
        System.out.println("Nome:" + p.getNome());
        System.out.println("Codigo:" + p.getCodigo());
        System.out.println("Matricula do funcionário:" + p.getMatricula());
        System.out.println("Quantidade:" + p.getQuantidade());
        System.out.println("Fornecedor:" + p.getFornecedor());
        System.out.println("Data:" + p.getData());
    }
}