import java.util.Scanner;
public class Pares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 5;
		int i,j,a[];
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite "+(i+1)+" números");
			a[i] = ler.nextInt(); }
		for(j=0;i<=a[i];j=j+2) {
		    System.out.println(j);
		    if(j<a[i]-1) {
				System.out.print(j+" - ");
			}else {
				System.out.print(j);
			}
		 }
	  
	     ler.close();
	}	
 }

