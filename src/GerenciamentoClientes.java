import java.util.ArrayList;
import java.util.List;

public class GerenciamentoClientes {
    private List<Cliente> clientes;

    public GerenciamentoClientes() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void editarCliente(String email, Cliente clienteAtualizado) {
        Cliente cliente = buscarClientePorEmail(email);
        if (cliente != null) {
            int index = clientes.indexOf(cliente);
            clientes.set(index, clienteAtualizado);
            System.out.println("Cliente atualizado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void removerCliente(String email) {
        Cliente cliente = buscarClientePorEmail(email);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("");
            System.out.println("Cliente"+cliente.getNome()+" removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void visualizarClientes() {
        clientes.forEach(Cliente::visualizarDetalhes);
    }

    private Cliente buscarClientePorEmail(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equalsIgnoreCase(email)) {
                return cliente;
            }
        }
        return null;
    }
}
