class Caixa extends Funcionario {
    private int numeroDoGuiche;

    public void setNumeroDoGuiche(int numeroDoGuiche) {
        this.numeroDoGuiche = numeroDoGuiche;
    }

    public int getNumeroDoGuiche() {
        return this.numeroDoGuiche;
    }

    public double getBonificacaoNatalina() {
        return this.salario * 0.15;
    }
}