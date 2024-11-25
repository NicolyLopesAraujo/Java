package exVetor;
import java.util.Scanner;

public class divisores {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a[];
		
		a = new int [10];
		
		for (int i = 0; i<10; i++) {
			
			System.out.println("Digite os 10 elementos: ");
			a[i] = ler.nextInt();
			
			for (int j = 1; j<=a[i]; j++) {
				
				if (a[i] % j ==  0) {
					System.out.println("Os divisores são: " + j);
				}
				
			}
			
			
		}
		
		ler.close();
	}

}
