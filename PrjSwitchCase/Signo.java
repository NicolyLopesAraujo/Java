import java.util.Scanner;
public class Signo {
    public static void main(String[] args) {
    	Scanner ler= new Scanner(System.in);
    	int dia,mes;
    	System.out.println("Digite o dia do nascimento:");
    	dia = ler.nextInt();
    	System.out.println("Digite o mês do nascimento");
    	mes = ler.nextInt();
    	switch (mes) {
    	case 1:
    		if (dia<=20) {
    			System.out.println("Capricórnio");
    	   }else {
    			System.out.println("Aquário");
    	   }
    		break;
    	case 2:
    		if (dia<=19) {
    			System.out.println("Aquário");
    		}else {
    			System.out.println("Peixes");
    		}
    		 break;
    	case 3:
    		if (dia<=20) {
    			System.out.println("Peixes");
    		}else {
    			System.out.println("Áries");
    		}
    		 break;
    	case 4:
    		if (dia<=20) {
    			System.out.println("Áries");
    		}else {
    			System.out.println("Touro");
    		}
    		 break;
    	case 5:
    		if (dia<=20) {
    			System.out.println("Touro");
    		}else {
    			System.out.println("Gêmeos");
    		}
    		 break;
    	case 6:
    		if (dia<=20) {
    			System.out.println("Gêmeos");
    		}else {
    			System.out.println("Câncer");
    		}
    		 break;
    	case 7:
    		if (dia<=21) {
    			System.out.println("Câncer");
    		}else {
    			System.out.println("Leão");
    		}
    		 break;
    	case 8:
    		if (dia<=22) {
    			System.out.println("Leão");
    		}else {
    			System.out.println("Virgem");
    		}
    		 break;
    	case 9:
    		if (dia<=22) {
    			System.out.println("Virgem");
    		}else {
    			System.out.println("Libra");
    		}
    		 break;
    	case 10:
    		if (dia<=22) {
    			System.out.println("Libra");
    		}else {
    			System.out.println("Escorpião");
    		}
    		 break;
    	case 11:
    		if (dia<=21) {
    			System.out.println("Escorpião");
    		}else {
    			System.out.println("Sagitário");
    		}
    		 break;
    	case 12:
    		if (dia<=21) {
    			System.out.println("Sagitário");
    		}else {
    			System.out.println("Capricórnio");
    		}
    		break;
    		default:
    			System.out.println("Mês inválido");
    	}
    	ler.close();
	
    }
}
