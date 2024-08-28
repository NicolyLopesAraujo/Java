package lista02;
import java.util.Scanner;

public class ValoresInteiros {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		//Leia(a)
		System.out.println("Digite o valor de A");
		a = ler.nextInt();
		//Leia(b)
		System.out.println("Digite o valor B");
		b = ler.nextInt();
		c=a;
		a=b;
		b=c;
		//Escreva(a, b)
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		ler.close();
	}
}