package lista02;
import java.util.Scanner;

public class DescontoPreco {
    public static void main (String arg[]) {
        Scanner ler = new Scanner(System.in);
        double preco, desconto, descontodecimal, precodesconto;
        //leia(preco)
        System.out.println("Digite o preço:");
        preco = ler.nextDouble();
        //leia(desconto)
        System.out.println("Digite o desconto:");
        desconto = ler.nextDouble();
        //Calcule(descontodecimal)
        descontodecimal = desconto/100;
        //Calcule(precodesconto)
        precodesconto = preco- (preco * descontodecimal);
        //Apresente(precodesconto)
        System.out.println("O desconto sobre o preço é de: " + precodesconto);
        ler.close();
    }
}