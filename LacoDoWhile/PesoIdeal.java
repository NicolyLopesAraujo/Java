package facaenquanto;
import java.util.Scanner;

public class PesoIdeal {
	public static void main(String[] args) {
		
		double s, pim, pif, r, al;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite seu sexo, 1 para masculino e 2 para feminino: ");
		s = ler.nextDouble();
		
		System.out.println("Digite sua altura: ");
		al = ler.nextDouble();
		
		if (s==1) {
			pim = 52+ (0.75*(al-152.4));
			System.out.println("Seu peso ideal é: " + pim );
		} else if (s==2) {
			pif = 52+(0.67*(al-152.4));
			System.out.println("Seu peso ideal é: " + pif);
		}
		
		System.out.println("Deseja continuar? Digite 1 para Sim");
		r = ler.nextDouble();
		
		ler.close();
	}

}
