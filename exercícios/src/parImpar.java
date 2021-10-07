import java.util.Scanner;


public class parImpar {
//Faça um Programa que peça um número inteiro e se este número for par, transforme-o em impar e vice-versa.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ent = new Scanner(System.in);
		System.out.print("Informe o número: ");
		int num = ent.nextInt();
		if ((num % 2)==0) 
		System.out.println("número convertido para impar: " + ((num)+1));
		else if ((num % 2)!=0) 
			System.out.println("número convertido para par: " + ((num)+1));
		else 
			System.out.println("zero");
			ent.close();
	
	}

}