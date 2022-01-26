public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        gerente.setNome("Maria");
        funcionario.setNome("Pedro");

        gerente.setSalario(1000.00);
        funcionario.setSalario(900.00);

        gerente.setSenha(123);

        if(gerente.autentica(1232)) {
            System.out.println("Autenticado");
        } else {
            System.out.println("Não autenticado");
        }

        System.out.println(funcionario.getNome() + " Salário -> " + funcionario.getBonificacaoNatalina());
        System.out.println(gerente.getNome() + " Sálario -> " + gerente.getBonificacaoNatalina(40000));
        
        Funcionario gerente1 = new Gerente();
        //gerente1.autentica(1232);

        OutraConta oc = new OutraConta2();
        if(gerente instanceof Funcionario) {
            System.out.println("Sim!!!!");
        }
    }
}
