public class Conta {
    private Cliente titular;
    private int numero;
    private double saldo = 500;
    public static int counter = 0;

    public Conta() {}

    public Conta(String nomeTitular, int numero) {
        if(numero > 0) {
            this.numero = numero;
        }
        this.titular = new Cliente(nomeTitular);
        Conta.counter++;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposita(double valor) {
        if(valor < 0) {
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
    }

    public boolean transfere(double valor, Conta contaDestino) {
        if(saldo >= valor) {
            this.saldo -= valor;
            return contaDestino.deposita(valor);
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getCliente() {
        return this.titular;
    } 
    
    public void exibeDados() {
        System.out.println(("Nome do titular: " + this.titular.getNome()));
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Numero da conta: " + this.getNumero());
    }
}
