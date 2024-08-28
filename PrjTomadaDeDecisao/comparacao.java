package tomadaDecisao2;
import java.util.Scanner;
public class comparacao {
	public static void main(String[] args) {
		int id, idVelho, idNovo;
		String nome, nomeVelho, nomeNovo;
		
		Scanner ler = new Scanner (System.in);
		nome = ler.next();
		id = ler.nextInt();
		nome = nomeVelho;
		id = idVelho;
		nome = nomeNovo;
		id = idNovo;
		nome = ler.next();
		id = ler.nextInt();
		
		if (id > idVelho) {
			id = idVelho;
			nome = nomeVelho;
		} else {
			id = idNovo;
			nome = nomeNovo;
		}
		nome = ler.next();
		id = ler.nextInt();
		if (id > idVelho) {
			id= idVelho;
			nome = nomeVelho;
		} else {
			id= idNovo;
			nome= nomeNovo;
		} 
		nome = ler.next();
		id = ler.nextInt();
	  if (id> idVelho) {
		id = idVelho;
		nome = nomeVelho;
		else {
			id = idNovo;
			nome = nomeNovo;
		} 
		id = ler.nextInt();
		nome = ler.next();
	} if (id > idVelho) {
		id = idVelho;
		nome = nomeVelho;
	} else {
		id = idNovo;
		nome = nomeNovo;
	}
	System.out.println("O mais novo é: " + nomeNovo + "com" + idNovo + "anos.");
	System.out.println("O mais velho é: " + nomeVelho + "com" + idVelho + "anos.");
	

    ler.close();
}
