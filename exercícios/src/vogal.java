import java.util.Scanner;

public class vogal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.println("escreva uma das letras ");
		String selectChar = ent.nextLine();
		char[] vogal = new char[] { 'A', 'E', 'I', 'O', 'U' };
		for(char reader : vogal) {
			if(selectChar.equals(String.valueOf(reader))) {
			System.out.println("É uma vogal");
			break;
			}
		
			 
		}
		
}
		

	}

