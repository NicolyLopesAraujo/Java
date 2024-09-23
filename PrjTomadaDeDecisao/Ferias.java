import java.util.Scanner;

public class Ferias {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int esc;
        double s, sf,sf2;
        System.out.println("Qual valor do seu salario?");
        s = in.nextDouble();
        System.out.println("Se for vender suas ferias digite 1, se não digite 2:");
        esc = in.nextInt();
        if (esc==1) {
        	sf = (s/30)*30+s;
        	System.out.println(" Seu salário final será:" +sf);
        }else if (esc==2) {
        	sf2 = (s+ (s/3));
        	System.out.println(" Seu salário final será:" +sf2);
        }else {
        	System.out.println(" Inválido");
	    }
        in.close();
	}
 
}
