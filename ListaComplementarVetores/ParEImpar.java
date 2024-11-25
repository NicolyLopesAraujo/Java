import java.util.Scanner;

public class ParEImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 20;
		int a[],b[],i,j,par,impar;
		
		
		a = new int [TAM];
		b = new int [TAM];

		par=0;
		impar=TAM-1;
		
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com "+(i+1)+" valores:");
			a[i] = ler.nextInt();
			
			if (a[i]%2==0) {
 				b[par] = a[i];
				par++;
			}else {
				b[impar] = a[i];
				impar--;
			}
		
		
		}
		for (i=0;i<TAM;i++) {
			System.out.println(b[i]);
		
		}
		
		}
	}


