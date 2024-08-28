package lista02;
import java.util.Scanner;

public class Dias {
	public static void main (String args[]) {
	   Scanner ler = new Scanner(System.in);
	   double dias, meses, anos;
	   //leia(dias)
	   System.out.println("Digite a quantidade de dias:");
	   dias = ler.nextDouble();
	   meses=(dias/30);
	   //escreva meses
	   System.out.println("Os meses são:" + meses);
	   anos=(dias/365);
	   //escreva anos
	   System.out.println("Os anos são:" + anos);
	   ler.close();  
	}

}
