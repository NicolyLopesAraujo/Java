import java.util.Scanner;
public class Pares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		int i,j,a[];
		a = new int [TAM];

		//Leitura dos valores
		for(i=0;i<TAM;i++) {
			System.out.println("Digite "+(i+1)+" números");
			a[i] = ler.nextInt(); }
		//Apresentação 
		for(i=0;i<10;i++) {
			System.out.println("Elemento a[ " + i + "] = " + a[i]);
			System.out.println("Os pares são: ");
		}
		//Esse serve para verificar os números pares, o j ele serve para ir contando ate quando o elemento do vetor for menor ou igual a ele mesmo 
		for(j=0;i<=a[i];j++) {
		// Aqui ira apresentar os numeros pares
		    System.out.println(j);
		    if(j%2==0) {
				System.out.print(j+" - ");
			}
		 }
	  
	     ler.close();
	}	
 }

