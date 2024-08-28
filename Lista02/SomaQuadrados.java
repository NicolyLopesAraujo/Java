package lista02;
import java.util.Scanner;

 public class SomaQuadrados {
	 public static void main(String args[]) {
	  Scanner ler = new Scanner(System.in);
	  double valor1,q1, valor2, q2, valor3, q3, soma;
	  //Leia(valor1)
	  System.out.println("Digite o valor 1:");
	  valor1 = ler.nextDouble();
	  //calcule (q1)
	  q1 = (valor1*valor1);
	  //Leia(valor2)
	  System.out.println("Digite o valor 2:");
	  valor2 = ler.nextDouble();
	  //Calcule(q2)
	  q2 = (valor2*valor2);
	  //Leia(valor3)
	  System.out.println("Digite o valor 3:");
	  valor3 = ler.nextDouble();
	  //Calcule(q3)
	  q3 = (valor3*valor3);
	  //Calcule(soma)
	  soma = (q1+q2+q3);
	  //Apresente (soma)
	  System.out.println("A soma do quadrado dos tres valores é:" + soma);
	  ler.close();

    }
 }
