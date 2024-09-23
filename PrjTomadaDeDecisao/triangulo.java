package tomadadecisao2;
import java.util.Scanner;
public class triangulo {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite o valor do lado A");
		a = ler.nextDouble();
		System.out.println("Digite o valor do lado B");
		b = ler.nextDouble();
		System.out.println("Digite o valor do lado C");
		c = ler.nextDouble();
		
		if (a< (b+c) || b< (a+c) || c< (a+b)) {
			System.out.println("É um triângulo");
		} else {
			System.out.println("Não é um triângulo");
		}
		if (a==b && a==c) {
			System.out.println("Equilátero");
		} else if (a!=b && a!= c) {
			System.out.println("Escaleno");
		} else {
			System.out.println("Isósceles");
		}
		
	ler.close();
	
	}

}
