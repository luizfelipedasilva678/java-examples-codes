import packages.Cliente;

public class App {
    public static void main (String[] args) {
        Cliente cliente = new Cliente("Joana");

        System.out.println("Nome: " + cliente.getNome());
    }
}