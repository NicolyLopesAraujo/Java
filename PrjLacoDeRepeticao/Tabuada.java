import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int r,n,i=1;
		System.out.println("Digite o número");
		n = ler.nextInt();
		while (i<11) {
			r = n*i;
			System.out.println(n+"x"+i+"="+r);
			i++;
		}
	ler.close();
	}

}
