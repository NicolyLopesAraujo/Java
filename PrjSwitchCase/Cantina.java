import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int codigo;
		System.out.println("Informe o código do produto:");
		codigo = ler.nextInt();
		switch (codigo) {
		case 1:
			System.out.println("Cachorro quente, no valor de R$8,00");
			break;
		case 2:
			System.out.println("CheeseBurger, no valor de R$12,00");
			break;
		case 3:
			System.out.println("X-Salada, no valor de R$15,00");
			break;
		case 4:
			System.out.println("Misto-quente, no valor de R$11,00");
			break;
		case 5:
			System.out.println("Pão na chapa, no valor de R$6,00");
			break;
			default:
			System.out.println("Código inválido");
		}
		ler.close();
	}

}
