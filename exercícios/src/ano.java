import java.util.Scanner;
public class ano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int Ano;
		
		System.out.print("coloque o ano: ");
		Ano = ent.nextInt();
		
		if (Ano % 4 == 0) {
		System.out.println("o ano é bissexto: ");
		}else if ((Ano %4 == 0)&&(Ano % 100 != 0)){
			System.out.println("O ano não é bissexto: ");
			}else {
				System.out.println("não é bissexto "+ Ano);
		
		}
		
		
		ent.close();
		}

}

	
		
		


