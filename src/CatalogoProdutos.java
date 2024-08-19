import java.util.ArrayList;
import java.util.List;

public class CatalogoProdutos {
    private List<Produto> produtos;

    public CatalogoProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void editarProduto(String nome, Produto novoProduto) {
        Produto produto = buscarProdutoPorNome(nome);
        if (produto != null) {
            int index = produtos.indexOf(produto);
            produtos.set(index, novoProduto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void removerProduto(String nome) {
        Produto produto = buscarProdutoPorNome(nome);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto"+produto.getNome()+" removido com sucesso.");
            System.out.println("");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void visualizarProdutos() {
        produtos.forEach(produto -> produto.visualizarDetalhes());
    }

    private Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
