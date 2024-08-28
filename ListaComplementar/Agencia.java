import java.util.*;
public class Agencia {
       public static void main (String[] args) {
	           Scanner in = new Scanner(System.in);
	           int local, dias;
	           double v1,v2,v3,v4,v5,v6;
	           
	           System.out.println("Digite 1 para Ilha Bela e 2 para Fernando de Noronha::");
	           local = in.nextInt();
	           System.out.println("Por quantos dias será a sua estadia?:");
	           dias = in.nextInt();
	           switch(local) {
	                  case 1:
	                          System.out.println("Ilha Bela");
	                           if(dias<=5) {
	                               v1= dias*240;
	                               System.out.println("O valor a ser pago e: "+v1);
	                           }else if(dias<10){
	                                v2 = 130+(dias*220);
	                                System.out.println("O valor a ser pago e: "+v2);
                            	}else{
	                                v3 = 150+(dias*210);
	                                System.out.println("O valor a ser pago e: "+v3);
                            	}
	                           break;
	                  case 2:
	                	   if (dias<=5) {
	                		  v4 = 100+(dias*400);
	                		  System.out.println("O valor a ser pago e: "+v4);
	                	  }else if(dias<11) {
	                		  v5 = 150+(dias*410);
	                		  System.out.println("O valor da sua estadia e "+v5);
	                	  }else {
	                		  v6 = 200+(dias*420);
	                		  System.out.println("O valor da sua estadia e "+v6);
	                	  }
	                	 
	                            }
       
	in.close();

	}
}
	
