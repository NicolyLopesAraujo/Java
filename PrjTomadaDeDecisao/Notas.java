import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int n1, n2, m, novaNota, mediaNova;
	System.out.println("Digite a primeira nota:");
	n1 = in.nextInt();
	System.out.println("Digite a segunda nota:");
	n2 = in.nextInt();
	m = (n1+n2)/2;
	if (m<3) {
		System.out.println("Reprovado");
	} else if (m >=6) {
		System.out.println("Aprovado");
	} else  {
		System.out.println("Exame");
		System.out.println("Digite sua nota nova:");
		novaNota = in.nextInt();
		mediaNova = (novaNota+m)/2; 
     if (mediaNova>=6) {
		System.out.println("Aprovado");
	}else {
		System.out.println("Reprovado");
	}
	in.close();
}

  }
        }
