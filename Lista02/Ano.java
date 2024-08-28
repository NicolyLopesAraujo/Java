package lista02;
import java.util.Scanner;

public class Ano {
  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    int idade, anoA, anoN;
    //Leia(anoN)
    System.out.println("Digite seu ano de nascimento:");
    anoN = ler.nextInt();
    //Leia(anoA)
    System.out.println("Digite o ano atual:");
    anoA = ler.nextInt();
    idade=(anoA-anoN);
    //Escreva idade
    System.out.println("Sua idade é:" + idade);
    ler.close();
    
	}
}