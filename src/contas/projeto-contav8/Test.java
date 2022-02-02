public class Test {
    public static void main(String args[]) {
        Gerente elton = new Gerente();
        elton.setSalario(10000); 
        elton.setNome("Elton gomes");

        Gerente william = new Gerente();
        william.setNome("William");
        william.setSalario(12000);

        Caixa juliana = new Caixa();
        juliana.setNome("Juliana");
        juliana.setSalario(30000);

        ContabilizadorDeBonificacoes contabilizador = new ContabilizadorDeBonificacoes();
        contabilizador.contabilizadorDeBonificacoes(elton);
        contabilizador.contabilizadorDeBonificacoes(william);
        contabilizador.contabilizadorDeBonificacoes(juliana);

        System.out.println("Total " + contabilizador.getValorTotalEmBonificacoesNatalinas());
    }
}
