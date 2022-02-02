public class SistemaInterno {
    private int senhaSistema;

    public void login(Gerente g) {
        if(g.autentica(this.senhaSistema)) {
           System.out.println("Acesso liberado"); 
        } else {
           System.out.println("Acesso negado"); 
        }
    }
}
