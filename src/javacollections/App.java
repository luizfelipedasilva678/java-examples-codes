import java.util.*;

public class App {
   public static void main(String[] args) {
    Conta c1 = new Conta("Teste1", 1212);
    c1.deposita(100000);

    Conta c2 = new Conta("Teste12", 1212);
    c1.deposita(10034000);

    List<String> lista = new ArrayList<String>();
    lista.add("Joao");
    System.out.println(lista.contains("Joao"));

    List<Double> lista2 = new ArrayList<Double>();
    lista2.add(2.4);
    lista2.add(1.4);
    Collections.sort(lista2);
    System.out.println(lista2);

    List<Conta> contas = new ArrayList<Conta>();
    contas.add(c1);
    contas.add(c2);

    System.out.println(contas);

    Collections.sort(contas, new Comparator<Conta>() {
        public int compare(Conta c1, Conta c2){ 
            if(c1.getSaldo() < c2.getSaldo())
                return -1;
            else if(c1.getSaldo() > c2.getSaldo())
                return 1;
            else
                return 0;
        }
    });

    System.out.println(contas);

    Set<String> conjunto = new HashSet<String>();
    conjunto.add("José");
    conjunto.add("Pedro");
    conjunto.add("Paulo");
    conjunto.add("Pedro");//repetido
    conjunto.add("Maria");
    conjunto.add("Roberto");
    System.out.println(conjunto);

    for (Object palavra : conjunto) {
        System.out.println(palavra);
    }

    Iterator it2 = conjunto.iterator();
    while(it2.hasNext())
        System.out.println((String) it2.next());

    Map<String, String> mapaDeContas= new HashMap();
    mapaDeContas.put("diretor","Paul21312o");
    mapaDeContas.put("gerente","Maria");
    System.out.println(mapaDeContas.get("diretor"));
   }    
}
