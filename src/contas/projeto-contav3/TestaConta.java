public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        Conta conta1 = new Conta();
        conta1.titular = cliente;
        conta1.numero = 123;
        conta1.saldo = 3000;
        conta1.saca(50);
        conta1.deposita(100000);

        Conta conta2 = new Conta();

        conta1.transfere(3000, conta2);

        System.out.println("Titular: " + conta1.titular.nome);
        System.out.println("Numero: " + conta1.numero);
        System.out.println("Saldo: " + conta1.saldo);

        System.out.println("Saldo conta 2: " + conta2.saldo);
    }
}
