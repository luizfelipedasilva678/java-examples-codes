public class BarraDeProgresso implements Runnable {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Dentro do BarraDeProgresso " + i);
        }
    }
}