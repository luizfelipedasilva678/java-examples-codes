public class GeraPDF implements Runnable{
    public void run() {
        for(int i=0 ; i<10;i++) {
            System.out.println("Dentro do GeraPDF "+ i);
        }
    }
}