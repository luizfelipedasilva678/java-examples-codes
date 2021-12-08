public class TestaEncapsulamento {
    public static void main(String[] args) {
        Conta umaConta = new Conta("Vitorino", 3);
        umaConta.deposita(500);
        umaConta.saca(500);

        Conta umaConta2 = new Conta("Vitorino", 3);
        umaConta2.deposita(500);
        umaConta2.saca(500);

        umaConta.exibeDados();
        System.out.println("Numero de contas criadas: " + Conta.counter);
    }
}
