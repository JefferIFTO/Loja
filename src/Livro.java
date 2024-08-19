public class Livro extends Produto {
    private String autor;
    private String editora;
    private String isbn;

    public Livro(String nome, double preco, String descricao, String autor, String editora, String isbn) {
        super(nome, preco, descricao);
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
    }

    // Getters e setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void visualizarDetalhes() {
        System.out.println("**********************************************************");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("ISBN: " + isbn);
    }
}
