import java.util.Scanner;

public class Prestacao {
	 public static void main (String[] args) {
         Scanner in = new Scanner(System.in);
         int dias;
         double valPres,valFin1,valFin2;
         System.out.println(" Qual o valor da prestação?");
         valPres = in.nextDouble();
         System.out.println(" Quantos dias ela esta vencida?");
         dias = in.nextInt();
         if (dias<=45) {
        	valFin1 = valPres+(0.02*valPres)+(0.0001*dias);
        	System.out.println("O valor final da prestação será:" + valFin1);
         }else if(dias>45) {
        	 valFin2 = valPres +(0.02*valPres)+(0.03*valPres)+(0.0001*dias);
         }else {
        	 System.out.println("Invalido");  
         }
in.close();
  }
}