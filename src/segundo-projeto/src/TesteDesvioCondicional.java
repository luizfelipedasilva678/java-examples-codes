public class TesteDesvioCondicional {
    public static void main(String[] args) {
        double nota1 = 10.8;
        double nota2 = 7.2;
        double media = (nota1 + nota2) / 2;

        if(media >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        double frequencia = 74.99;

        if(frequencia < 75) {
            System.out.println("Reprovado");
        } else {
            if(media >= 5) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }

        boolean frequenciaMinima = (frequencia >= 75) ? true : false;

        if(frequencia >= 75) {
            frequenciaMinima = true;
        } else {
            frequenciaMinima = false;
        }
        System.out.println(frequenciaMinima);

        if(media < 7 || frequenciaMinima == true) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}
