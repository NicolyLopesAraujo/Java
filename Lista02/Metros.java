package lista02;
import java.util.Scanner;

public class Metros {
    public static void main (String arg[]) {
        Scanner ler = new Scanner(System.in);
        double m, km;
        //leia(m)
        System.out.println("Digite a quantidade de metros:");
        m = ler.nextDouble();
        //Calcule(km)
        km = m/1000;
        //Apresente(ipva)
        System.out.println("A quantidade dos metros em quilometros é: " + km);
        ler.close();
    }
}