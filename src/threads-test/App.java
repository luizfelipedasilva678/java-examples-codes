public class App {
    public static void main(String[] args) {
        /*
        GeraPDF geraPdf = new GeraPDF();
        Thread threadDoPdf = new Thread(geraPdf);
        threadDoPdf.start();

        BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
        Thread threadDabarra = new Thread(barraDeProgresso);
        threadDabarra.start();
        */

        GeraPDFThread threadDoPdf = new GeraPDFThread ("Thread do Pdf...");
        BarraDeProgressoThread threadDaBarra = new BarraDeProgressoThread("Thread da barra...");
        try {
            threadDoPdf.start();
            threadDaBarra.sleep(3000);
            threadDaBarra.start();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}