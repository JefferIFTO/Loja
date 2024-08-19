public class Roupa extends Produto {
    private String tamanho;
    private String cor;
    private String material;

    public Roupa(String nome, double preco, String descricao, String tamanho, String cor, String material) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // Getters e setters
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void visualizarDetalhes() {
        System.out.println("**********************************************************");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Material: " + material);
    }
}
