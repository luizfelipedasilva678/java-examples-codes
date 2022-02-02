package contas;
public class TestaCasting {
	public static void main(String[] args) {
		float numFloat = 5.78f;
		double precoDaHeineken = 4.69;
		float precoNovoDaHeineken = (float) (precoDaHeineken + 0.01);
		int precoDaHeinekenComDesconto = (int) precoNovoDaHeineken;
		
		double n1, n2;
		
		n1 = 0.2;
		n2 = 0.1;
		double total = n1 + n2;
		System.out.println(total);
		
		int x,y;
		x = 5;
		System.out.println("x é " + x);
	}
}
