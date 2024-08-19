public class Eletronico extends Produto {
    private String marca;
    private int garantia; // Garantia em meses

    public Eletronico(String nome, double preco, String descricao, String marca, int garantia) {
        super(nome, preco, descricao);
        this.marca = marca;
        this.garantia = garantia;
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public void visualizarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Marca: " + marca);
        System.out.println("Garantia: " + garantia + " meses");
    }
}
