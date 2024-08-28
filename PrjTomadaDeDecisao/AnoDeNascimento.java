import java.util.Scanner;
public class AnoDeNascimento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int an, at, id;
		
		System.out.println("Digite seu ano de nascimento: ");
		an = ler.nextInt();
		System.out.println("Digite o ano atual: ");
		at = ler.nextInt();
		id = at-an;
		if (id<10) {
			System.out.println("Criança");
		} else if (id<18) {
			System.out.println("Adolescente");
		} else if (id<60) {
			System.out.println ("Adulto");
		} else {
			System.out.println("Idoso");
		}
	   ler.close();

	}

}
