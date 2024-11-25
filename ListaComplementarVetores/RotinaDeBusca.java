import java.util.Scanner;
public class RotinaDeBusca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[],i,x,tem=0;
		
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite "+(i+1)+" elementos");
			a[i] = ler.nextInt();
		}
		System.out.println("Digite um elemento x, para verificar se há em A:");
		x = ler.nextInt();
		
		for(i=0;i<TAM;i++) {
			if (x == a[i]) {
				tem++;
			}
		}
		if (tem>=1) {
			System.out.println("O valor esta armazenado no vetor A");
			
		}else {
			System.out.println("O valor não foi encontrado em nenhuma posição");
		}
		ler.close();
	}

}
