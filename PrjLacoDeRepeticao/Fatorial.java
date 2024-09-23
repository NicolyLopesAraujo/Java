import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n, i,f;
	System.out.println("Digite um número para saber seu fatorial!!");
	n = ler.nextInt();
	i = n;
	f = 1;
	 while(i>0) {
		 f = f*i;
		 i=i-1;
	 }
	 System.out.println( " O fatorial será:"+f); 
	 ler.close();
	}

}
