package lista02;
import java.util.Scanner;

public class Media2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;
		//Leia(nota1)
		System.out.println("digite a nota 1:");
		nota1 = ler.nextDouble();
		//Leia(nota2)
		System.out.println("Digite a nota 2");
		nota2 = ler.nextDouble();
		//Calcule(media)
		media=(nota1+nota2)/2;
		//Escreva Media
		System.out.println("Sua média é:" + media);
		ler.close();
	}
}