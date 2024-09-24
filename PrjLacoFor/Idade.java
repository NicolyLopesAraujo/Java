import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		int an,aa,id,idVelho,idNovo;
		Scanner ler = new Scanner(System.in);
		for (i=1;i<=10;i++) {
			System.out.println("Digite o ano de nascimento:");
			an = ler.nextInt();
			System.out.println("Digite o ano atual:");
			aa = ler.nextInt();
			id = aa-an;
			System.out.println("A idade será:"+id);
		}
		if (id>idVelho) {
			id = idVelho;
		} else {
			id = idNovo;
		}
		System.out.println("O mais novo é: " + idNovo +"anos.");
		System.out.println("O mais velho é: " +idVelho +"anos.");
	}
	
}
