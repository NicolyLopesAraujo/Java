import java.util.Scanner;

public class Festa1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int h, m, doce, salgado;
		double bebida, bolo;
		//leia(m)
		System.out.println("Digite o número de mulheres:");
		m = ler.nextInt();
		//leia(h)
		System.out.println("Digite o número de homens:");
		h = ler.nextInt();
		//Calcule(salgado)
		salgado = h*15 + m * 10;
		//Calcule(doce)
		doce = h*6 + m*8;
		//Calcule(bolo)
		bolo = ((h+m)*100)/1000;
		//Calcule(bebida)
		bebida = (h*600 + m*500)/1000;
		//Escreva(salgado, doce, bolo, bebida)
		System.out.println("A quantidade de salgados necessário:" +salgado);
		System.out.println("A quantidade de doces necessário:" +doce);
		System.out.println("A quantidade de bolo necessário:" +bolo);
		System.out.println("A quantidade de bebida necessário:" +bebida);
		ler.close();
	}

}
