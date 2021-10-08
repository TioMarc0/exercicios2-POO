import java.util.Scanner;
public class turnoDeEstudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.println("Informe seu turno: M para Matutino , V para Vespertino , N para Noturno.");
		String turno = ent.next();
		if ("m" .equalsIgnoreCase(turno)) {
			System.out.println("Bom dia! Queridos alunos do turno matutino ");}
		else if ("v" .equalsIgnoreCase(turno)) {
			System.out.println("Boa tarde! Queridos alunos do turno vespertino");}
		else if ("n" .equalsIgnoreCase(turno)) {
			System.out.println("Boa noite! Queridos alunos do turno ");}
			ent.close();
		
	}

}
