public class Conta {
    private Cliente titular = new Cliente();
    private int numero;
    private double saldo = 500;

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

    public void setNumero(int numero) {
        if(numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getCliente() {
        return this.titular;
    }
}
