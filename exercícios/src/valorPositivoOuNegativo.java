import java.util.Scanner;

public class valorPositivoOuNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.print("Informe o número: ");
		int num = ent.nextInt();
		if (num > 0)
		System.out.println("positivo");
		else if (num < 0)
			System.out.println("negativo");
		else
			System.out.println("zero");
			ent.close();
	}

}
