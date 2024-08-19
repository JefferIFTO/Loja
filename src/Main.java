public class Main {

    public static void main(String[] args) {
        CatalogoProdutos catalogo = new CatalogoProdutos();
        GerenciamentoClientes gerenciamentoClientes = new GerenciamentoClientes();



        // Adicionar clientes
        Cliente cliente1 = new Cliente("Maria Teste", "Rua centro", "maria@gmail.com");
        Cliente cliente2 = new Cliente("João Da Cunha", "Rua centro", "joao@hotmail.com");
        gerenciamentoClientes.adicionarCliente(cliente1);
        gerenciamentoClientes.adicionarCliente(cliente2);

        // Visualizar clientes antes da edição
        System.out.println("Antes da edição:");
        gerenciamentoClientes.visualizarClientes();


        Cliente clienteAtualizado = new Cliente("Maria Sufistinha", "Rua Do zé", "mariadelegada@naoexiste.com");

        // Editar o cliente existente
        gerenciamentoClientes.editarCliente("maria@gmail.com", clienteAtualizado);

        // Remover um cliente
        gerenciamentoClientes.removerCliente("joao@hotmail.com");


        System.out.println("\nApós a edição e remoção:");
        gerenciamentoClientes.visualizarClientes();







        Eletronico celular = new Eletronico("Celular Iphone 15Pro", 1999.99, "Celular de última geração", "MarcaX", 24);
        Livro livro = new Livro("Introdução Java", 100.90, "Livro de programação Java", "Khall Maax", "Livros", "978-3-16-148410-0");

        catalogo.adicionarProduto(celular);
        catalogo.adicionarProduto(livro);

        // Remover o produto
        System.out.println("");
        catalogo.removerProduto("Celular Iphone 15Pro");


        // Editar o produto
        Roupa camisaAntiga = new Roupa("Camisa Polo", 79.90, "Camisa polo azul", "M", "Azul", "Algodão");
        catalogo.adicionarProduto(camisaAntiga);

        // Visualizar produtos antes da edição
        System.out.println("Antes da edição:");
        catalogo.visualizarProdutos();


        Roupa camisaAtualizada = new Roupa("Camisa Flamengo", 69.90, "Camisa Flamengo vermelha", "M", "Vermelha", "Algodão");

        // Editar o produto existente
        catalogo.editarProduto("Camisa Polo", camisaAtualizada);

        System.out.println("\nApós a edição:");
        catalogo.visualizarProdutos();


    }
}
