package exVetor;
import java.util.Scanner;

public class fatoria {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], TAM =15;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (int i = 0; i<TAM; i++) {
			System.out.println("Insira um valor para obter o fatorial: ");
			a[i] = ler.nextInt();
			b[i] = 1 ;
			
			for (int j = a[i]; j>0; j=j-1) {
				b[i] = b[i]*j;
			}
			
			System.out.println(a[i] + "=" + b[i]);
		}
		
		ler.close();
	}

}
