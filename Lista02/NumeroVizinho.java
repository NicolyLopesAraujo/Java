package lista02;
import java.util.Scanner;

public class NumeroVizinho {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int valor, antecessor, sucessor;
		//Leia(valor)
		System.out.println("Digite um número:");
		valor = ler.nextInt();
		//Calcule(antecessor)
		antecessor = (valor-1);
		//Calcule(sucessor)
		sucessor = (valor+1);
		//apresente(antecessor, sucessor)
		System.out.println("Seu antecessor é:" + antecessor);
		System.out.println("Seu sucessor é:" + sucessor);
		ler.close();	
	}

}
