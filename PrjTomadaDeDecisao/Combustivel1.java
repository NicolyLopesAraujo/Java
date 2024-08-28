import java.util.Scanner;
public class Combustivel1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int dis, cap, consumo;
		System.out.println("Digite a distância percorrida:");
		dis = in.nextInt();
		System.out.println("Digite a capacidade do tanque do seu automovel:");
		cap = in.nextInt();
		consumo = dis/cap;
		if (consumo>=10){
			System.out.println("Seu carro é econômico!");
		}else {
			System.out.println("Seu carro não é econômico!");
		}
		in.close();
	}

}
