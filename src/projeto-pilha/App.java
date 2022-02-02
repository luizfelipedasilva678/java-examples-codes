public class App {
    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fim main");
    }

    private static void metodo1() {
        System.out.println("Inicio metodo1");
        metodo2();
        System.out.println("Fim metodo2");
    }

    private static void metodo2() {
        System.out.println("Inicio metodo2");
        int[] array =  new int[5];
        for(int i = 0; i < 5; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
        System.out.println("Fim metodo2");
    }
}
