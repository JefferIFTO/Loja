import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) throws ProdutoJaExisteNoCarrinhoException {
        if (produtos.contains(produto)) {
            throw new ProdutoJaExisteNoCarrinhoException("Este produto já está no carrinho.");
        }
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void visualizarCarrinho() {
        produtos.forEach(produto -> System.out.println(produto.getNome() + ": " + produto.getPreco()));
        System.out.println("Total: " + calcularTotal());
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    public void limparCarrinho() {
        produtos.clear();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
