package exVetor;
import java.util.Scanner;

public class numPrimo {
	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
        
        
        int[] a = new int[10];
        
       
        for (int j = 0; j < 10; j++) {
            System.out.println("Digite um número: ");
            a[j] = ler.nextInt();
            
            
            int numDivisores = 0;
            for (int i = 1; i <= a[j]; i++) {
                if (a[j] % i == 0) {
                    numDivisores++;
                }
            }
            
            
            if (numDivisores == 2) {
                System.out.println(a[j] + " é um número primo.");
            } else {
                System.out.println(a[j] + " não é um número primo.");
            }
        }
        ler.close();
	}

}
