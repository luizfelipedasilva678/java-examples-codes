public class TestaEncapsulamento {
    public static void main(String[] args) {
        Conta umaConta = new Conta("Vitorino", 3);
        umaConta.deposita(500);
        umaConta.saca(500);
        umaConta.exibeDados();
    }
}
