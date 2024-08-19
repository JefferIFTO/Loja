import java.util.Date;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private Date data;
    private String status;

    public Pedido(List<Produto> produtos) throws PedidoVazioException {
        if (produtos.isEmpty()) {
            throw new PedidoVazioException("O carrinho está vazio.");
        }
        this.produtos = produtos;
        this.data = new Date();
        this.status = "Processando";
    }

    public void visualizarPedido() {
        produtos.forEach(produto -> System.out.println(produto.getNome() + ": " + produto.getPreco()));
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}
