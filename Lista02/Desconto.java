package lista02;
import java.util.Scanner;

public class Desconto {
	
 public static void main(String args[]) {
 Scanner ler = new Scanner(System.in);
 double produto, desconto, novopreco;
 
 //leia(produto)
 System.out.println("Digite o valor do produto:");
 produto = ler.nextDouble();
 //calculo(desconto)
 desconto= produto/100*5;
 //calculo(novopreco)
 novopreco=produto-desconto;
 //Escreva o novopreco
 System.out.println("Seu novo preço é:" + novopreco);
 ler.close();
	 
 }
 
}
