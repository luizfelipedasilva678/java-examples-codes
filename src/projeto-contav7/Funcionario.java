public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public double getBonificacaoNatalina() {
        return this.salario * 1.1;
    }
}
