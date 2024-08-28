import java.util.Scanner;
public class Rodizio {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int N;
		
		N = ler.nextInt();
		
		switch (N) {
		
		case 1: 
		case 2:
			System.out.println("Segunda");
			break;
			
		case 3:
		case 4:
			System.out.println("Terça");
			break;
			
		case 5:
		case 6:
			System.out.println("Quarta");
			break;
			
		case 7:
		case 8: 
			System.out.println("Quinta");
			break;
			
		case 9:
		case 0: 
			System.out.println("Sexta");
			break;
			
		default: 
			System.out.println("Número inválido");
		
		}
		
		ler.close();
		
	}

}
