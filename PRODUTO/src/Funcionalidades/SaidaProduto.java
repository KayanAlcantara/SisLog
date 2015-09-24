package Funcionalidades;

public class SaidaProduto {

    public static void saida() {
        String nome, resp;
        int alt, quant;
        ProdutoPersiste produto = new ProdutoPersiste();

        System.out.println("Digite o nome do produto que deseja fazer a baixa:");
        nome = Utilidades.lerString();
        Produto p = ProdutoPersiste.ler(nome);
        quant = p.getQuantidade();

        if (quant > 0) {
            System.out.println("Digite a quantidade a ser retirada:");
            alt = Utilidades.lerInt();

            if (quant >= alt) {
                produto.setQuantidade(quant - alt);
                produto.setCodigo(p.getCodigo());
                produto.setNome(p.getNome());
                produto.setData(p.getData());
                produto.setFornecedor(p.getFornecedor());
                produto.setMatricula(p.getMatricula());

                System.out.println(produto.gravar());

                System.out.println("Deseja visualizar quantidade atual?(s/n)");
                resp = Utilidades.lerString();
                if (resp.equals("s")) {
                    System.out.println(produto.getQuantidade());
                }
            } else {
                System.out.println("Quantidade invalida!");
            }
        } else {
            System.out.println("Produto indisponivel!");
        }

    }
}
