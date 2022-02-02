public class Gerente extends Funcionario {
    private int senha = 0;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(senha == this.senha) return true;

        return false;
    }

    public double getBonificacaoNatalina() {
        return super.getBonificacaoNatalina() + this.salario * 1.5;
    }  
    
    public double getBonificacaoNatalina(double bonus) {
        return super.getBonificacaoNatalina() + this.salario * 1.5 + bonus;
    } 
}
