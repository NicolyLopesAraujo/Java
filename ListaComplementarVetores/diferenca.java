package exVetor;
import java.util.Scanner;

public class diferenca {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a[], b[],c[],TAM=10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		System.out.println("Digite os 10 valores do 1º conjunto: ");
		
		for (int i = 0; i<TAM; i++) {
			a[i] = ler.nextInt();
		}
		
		System.out.println("Digite os 10 valores do 2º conjunto: ");
		
		for (int i = 0; i<TAM; i++) {
			b[i] = ler.nextInt();
		}
		
		for (int i = 0; i<TAM; i++) {
			c[i] = a[i] - b[i];
		}
		
		System.out.println("Vetor c (diferença entre a e b): ");
		
		for (int i = 0; i<TAM; i++) {
			System.out.println(c[i]);
		}
		ler.close();
	}

}
