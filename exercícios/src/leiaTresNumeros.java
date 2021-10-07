

import java.util.Scanner;

public class leiaTresNumeros {
//Faça um Programa que leia três números e mostre-os em ordem crescente.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int x = 0;
		int y= 0;
		int z = 0;
		System.out.print("Digite o primeiro numero");
		int n1 = ent.nextInt();
		System.out.print("Digite o segundo numero");
		int n2 = ent.nextInt();
		System.out.print("Digite o Terceiro numero");
		int n3 = ent.nextInt();
		
		
		if ((n2<n1)&&(n2<n3))
			x= n2;
			
				else if (((n2<n1)&&(n2>n3))||((n2>n1)&&(n2<n3)))
					y = n2;
					
				else if ((n2>n1)&&(n2>n3))
					z = n2;
				
					
		if ((n3<n1)&&(n3<n2))
						x = n3;
					
			else if (((n3<n1)&&(n3>n2))||((n3>n1)&&(n3<n2)))
				y = n3;
							
				else if((n3>n1) && (n3>n2))
					z = n3;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		ent.close();
		
	}

}
