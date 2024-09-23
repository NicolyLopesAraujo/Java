import java.util.Scanner;
public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, i = 1, numDivisores = 0;
		
		System.out.println("Digite o número");
		num = ler.nextInt();
		
		while ( i <= num) {
			if (num % i ==  0) {
				numDivisores ++;
			}
		}
		
		if (numDivisores == 2) {
			System.out.println("É um número primo");
		} else {
			System.out.println("Não ´um número primo");
		}
		ler.close();
	}

}
