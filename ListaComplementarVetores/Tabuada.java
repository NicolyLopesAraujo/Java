import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 5;
		int i,j,a[],resultado;
		a = new int[TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite um número para descobrir a tabuada dele:");
			a[i] = ler.nextInt();
			
			for (j=0;j<=10;j++) {
				  resultado = a[i]*j;
				System.out.println(a[i]+"x"+j+"="+resultado);
			}
		}
	}
}
