import java.util.Scanner;

public class Taxi {
	 public static void main (String[] args) {
         Scanner in = new Scanner(System.in);
         int bg;
         double h,km,tarifa1, tarifa2;
         System.out.println("Se o horário da sua entrada for entre as 6h e as 20h digite 1, caso contrário digite 2:");
         h = in.nextDouble();
         System.out.println("Digite quantos quilometros serão percorridos:");
         km = in.nextDouble();
         System.out.println("Digite quantas bagagens serão levadas:");
         bg = in.nextInt();
         if (h==1) {
        	 tarifa1 = km*2.75 + 4.50 + (bg*2.75);
        	 System.out.println(" O valor da tarifa é de 1" + tarifa1);
         } else if (h==2) {
        	 tarifa2 = km*3.58 + 5.65 + (bg*2.75);
        	 System.out.println(" O valor da tarifa é de " + tarifa2);
         } else {
        	 System.out.println(" Opções inválidas!");
        		
        	 }
        	 in.close();
         }
 
	 }
