public abstract class ContaT {
    protected double saldo;
    private double limite;
    private int numero;
    
    public void saca(double quantidade) throws Exception {
        if ((this.saldo + this.limite) >= quantidade) {
            this.saldo -= quantidade;
        } else {
            throw new Exception("Novo:Saldo insuficiente. Você só pode sacar "+this.getSaldo()+this.getLimite());
        }
    }

    public void deposita(double quantidade) throws Exception {
        double novoSaldo=this.saldo+=quantidade;
        synchronized (this) {

            if (quantidade >= 0) {
                this.saldo =novoSaldo;
            } else{
                throw new Exception("Erro aodepositar");
            }
        }
    } 
    
    void transferePara(ContaT destino, double valor) {
        try {
            this.saca(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            destino.deposita(valor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void atualiza(double taxa) {
        this.saldo = this.saldo + (this.saldo * (taxa * 2));
    }
}
