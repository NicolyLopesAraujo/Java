import java.util.Scanner;
public class Bhaskara {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a, b, c, delta, x, x1, x2;
		System.out.println("Digite o valor de A :");
		a = in.nextDouble();
		System.out.println("Digite o valor de B :");
		b = in.nextDouble();
		System.out.println("Digite o valor de C :");
		c= in.nextDouble();
		delta = (b*b)-4*a*c;
		if (delta >0) {
			x1= (-b+sqrt(delta))/(2*a);
			x2= (-b-sqrt(delta))/(2*a);
			System.out.println("Existem duas raízes nesta equação, a primeira:  "+x1);
			System.out.println("Existem duas raízes nesta equação, a segunda  "+x2);
	   }   else if (delta ==0); {
		    x = -b/(2*a);
		    System.out.println("Existe apenas uma raíz real para a equação  "+x);
	   }  else {
		   System.out.println("Não existem raízes reais para essa equação");
	   }
	   in.close();
	}

	private static double sqrt(double delta) {
		return 0;
	}
	
}
