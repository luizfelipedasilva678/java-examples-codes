public class Conta {
    Cliente titular;
    int numero;
    double saldo = 500;

    public boolean saca(double valor) {
        if(saldo >= valor) {
            this.saldo = this.saldo - 50;
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
}
