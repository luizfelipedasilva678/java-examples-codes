public class GeraPDFThread extends Thread {
    public GeraPDFThread(String nomeDaThread) {
        super(nomeDaThread);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+" executando o passo "+i);
        }
    }
}

