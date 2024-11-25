package exVetor;

public class potencia {
	public static void main(String[] args) {
		
		int a[], potencia = 1;
		
		a = new int [11];
		
		for (int i = 0; i<11; i++) {
			a[i] = potencia;
			potencia = potencia * 2;
			
		}
		
		for (int i = 0; i<11; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		
		
	}

}
