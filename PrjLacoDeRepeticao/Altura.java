
public class Altura {

	public static void main(String[] args) {
		double cj = 2.5, cp = 2.0,  aj = 134, ap = 145;
		int ano=0;
		while (aj<ap) {
			aj = aj + cj;
			ap = ap + cp;
			ano = ano + 1;
			}
		System.out.println("Será necessario: " +ano+ " anos");
		

	}

}
