import java.util.Scanner;
public class Interseccao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int iguais=0;
		int a[],b[],c[],i,j;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[iguais];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite 10 valores, para a");
			a[i] = ler.nextInt();
		}
		for(j=0;j<TAM;j++) {
			System.out.println("Digite 10 valores, para b");
			b[j] = ler.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			for(j=0;i<TAM;j++)
			 if(a[i] == b[j]){
				 iguais++;
				 c[j]=a[i];
			 }
		
				 
			 }
		}		 

	}

