import java.util.Scanner;
public class Numero {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double n;
		
		System.out.println("Digite o número: ");
		n = ler.nextDouble();
		
		if (n< 0) {
			System.out.println("O número é negativo");
		} else if (n==0) {
			System.out.println("O número é neutro");
		} else {
			System.out.println("O número é positivo");
		}
		ler.close();
	}

}
