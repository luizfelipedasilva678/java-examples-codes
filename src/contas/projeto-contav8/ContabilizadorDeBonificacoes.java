public class ContabilizadorDeBonificacoes {
    private double valorTotalEmBonificacoesNatalinas;

    public void contabilizadorDeBonificacoes(Funcionario g) {
        double bonificacao = g.getBonificacaoNatalina();
        this.valorTotalEmBonificacoesNatalinas += bonificacao;
    }

    public double getValorTotalEmBonificacoesNatalinas() {
        return this.valorTotalEmBonificacoesNatalinas;
    }
}
