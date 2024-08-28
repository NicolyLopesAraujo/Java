import java.util.Scanner;
public class Eleição {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int nasc, idade;
		
		System.out.println("Digite seu ano de nascimento: ");
		nasc = ler.nextInt ();
		
		idade = 2026-nasc;
		
		System.out.println("Sua idade na próxima eleição será: "+idade);
		
		if(idade<16) {
			System.out.println("Você ainda não poderá votar");
		}else {
			System.out.println("Você poderá votar");
		}
		ler.close();
	}

}
