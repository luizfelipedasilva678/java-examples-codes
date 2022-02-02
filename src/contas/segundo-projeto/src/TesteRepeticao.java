public class TesteRepeticao {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i > 2 && i <= 4) {
                continue;
            }

            if(i == 7 ) {
                break;
            }

        }

        System.out.println("/*--------------------------*/");
        
        int contador = 0;
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }
    }
}
