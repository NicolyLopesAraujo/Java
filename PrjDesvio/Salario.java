import java.util.Scanner;
public class Salario {
	public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);
	double s;
	System.out.println("Digite seu salário:");
	s=ler.nextDouble();
	if (s>=1302) {
		System.out.println("Acima do salário mínimo");
	}else {
		System.out.println("Abaixo do salário mínimo"); 
	ler.close();
		}
	}
}