package lista02;
import java.util.Scanner;
public class Media {
		public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2,nota3, media;
		//Leia(nota1)
		System.out.println("digite a nota 1:");
		nota1 = ler.nextDouble();
		//Leia(nota2)
		System.out.println("Digite a nota 2");
		nota2 = ler.nextDouble();
		//Leia(nota3)
		System.out.println("Digite a nota 3");
		nota3 = ler.nextDouble();
		media=(nota1+nota2+nota3)/3;
		//Escreva Media
		System.out.println("Sua média é:" + media);
		ler.close();
	}
}



