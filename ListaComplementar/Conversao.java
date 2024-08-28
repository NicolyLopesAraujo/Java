import java.util.Scanner;

public class Conversao {
	 public static void main (String[] args) {
         Scanner in = new Scanner(System.in);
         int tv;
         double r, eu, dol, pes,conEu,conDol,conPes;
         System.out.println("Digite a quantidade em reais:");
         r = in.nextDouble();
         System.out.println("Se a viagem for nacional digite 1, se for europeia digite 2, se for norte americana digite 3, e se for sul americana digite 4");
         tv = in.nextInt();
         if (tv== 1) {
        	 System.out.println("O valor será:" +r);
         }else if (tv==2) {
        	 System.out.println("Digite a cotação atual do euro:");
        	 eu =  in.nextDouble();
        	 conEu = r*eu;
        			 System.out.println("O valor convertido será:" +conEu);
         }else if (tv==3) {
        	 System.out.println("Digite a cotação atual do dolar:");
        	 dol =  in.nextDouble();
        	 conDol = r*dol;
        			 System.out.println("O valor convertido será:" +conDol);
         }else if (tv==4) {
        	 System.out.println("Digite a cotação atual do peso argentino:");
        	 pes =  in.nextDouble();
        	 conPes = r*pes;
        	 System.out.println("O valor convertido será:" +conPes);
          }else {
        	 System.out.println("Inválido");
          }
         in.close();
	 }
}
