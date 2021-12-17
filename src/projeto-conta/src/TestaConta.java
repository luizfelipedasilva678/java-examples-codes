public class TestaEncapsulamento {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "Elton";
        conta1.numero = 123;
        conta1.saldo = 32323.232;

        System.out.println("Titular: " + conta1.titular);
        System.out.println("Numero: " + conta1.numero);
        System.out.println("Saldo: " + conta1.saldo);

    }
}
