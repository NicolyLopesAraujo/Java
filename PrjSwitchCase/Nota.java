import java.util.Scanner;
public class Nota {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int qt, mb, b, r, i;
		String m ; 
		double porcent;
		
		System.out.println("Digite a quantidade de MB");
		mb = ler.nextInt();
		System.out.println("Digite a quantidade B");
		b = ler.nextInt();
		System.out.println("Digite a quantidade de R");
		r = ler.nextInt();
		System.out.println("Digite a quantidade de I");
		i = ler.nextInt();
		
		qt = mb + b + r + i;
		System.out.println("Escolha a menção para consulta:");
		m = ler.next();
		
		switch (m) {
		case "mb":
			porcent = mb*100/qt;
			System.out.println("A porcentagem será" +porcent+ "%");
			break;
		case "b":
			porcent = b*100/qt;
			System.out.println("A porcentagem será" +porcent+ "%");
			break;
		case "r":
			porcent = r*100/qt;
			System.out.println("A porcentagem será" +porcent+ "%");
			break;
		case "i":
			porcent = i*100/qt;
			System.out.println("A porcentagem será" +porcent+ "%");
			break;
		default:
			System.out.println("Nota inválida");
			
	     
		}
		ler.close();
	}
	
	
	

}
