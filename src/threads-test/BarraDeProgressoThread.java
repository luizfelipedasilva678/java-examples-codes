public class BarraDeProgressoThread extends Thread{
    public BarraDeProgressoThread(String nomeDaThread) {
        super(nomeDaThread);
    }
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(this.getName()+" executando passo "+(i - 10000));
        }
    }
}
