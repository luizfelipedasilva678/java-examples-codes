public class TestaEncapsulamento {
    public static void main(String[] args) {
        Conta umaConta = new Conta();
        umaConta.getCliente().setNome("Vitorino");
        umaConta.deposita(500);
        umaConta.saca(500);
        umaConta.setNumero(1);

        System.out.println("Nome do titular: " + umaConta.getCliente().getNome());
        System.out.println("Saldo da conta: " + umaConta.getSaldo());
        System.out.println("Numero da conta: " + umaConta.getNumero());
    }
}
