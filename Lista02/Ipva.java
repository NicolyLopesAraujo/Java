package lista02;
import java.util.Scanner;

public class Ipva {
    public static void main (String args[]) {
        Scanner ler = new Scanner(System.in);
        double veiculo, ipva;
        //leia(veiculo)
        System.out.println("Digite o preço do carro:");
        veiculo = ler.nextDouble();
        //Calcule(ipva)
        ipva = veiculo*0.04;
        //Apresente(ipva)
        System.out.println("O valor do IPVA é: " + ipva);
        ler.close();
    }
}