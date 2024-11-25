import java.util.Scanner;

public class ParEImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 20;
		int a[],b[],i,j,par,impar;
		
		
		a = new int [TAM];
		b = new int [TAM];

		par=0;
		//Isso serve para exibir os impares depois dos pares
		impar=TAM-1;
		
		//Leitura dos números
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com "+(i+1)+" valores:");
			a[i] = ler.nextInt();
		//Este serve para se o resto for zero,quando divididos por 2,ele vai adicionar mais 1 no contador do par e adicionar esse número no vetor b
			if (a[i]%2==0) {
 				b[par] = a[i];
				par++;
		//Mas caso não ele ira adicionar no vetor b o impar, porem do fim ao começo, assim fazendo com que o impar apareça por ultimo 
			}else {
				b[impar] = a[i];
				impar--;
			}
		
		
		}
		//Já este serve para apresentar o números pelo vetor b
		for (i=0;i<TAM;i++) {
			System.out.println(b[i]);
		
		}
		
		}
	}


