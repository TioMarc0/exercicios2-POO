import java.util.Scanner;

public class maiorVal {


public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ent = new Scanner(System.in);
		System.out.print("digite o primeiro valor: ");
		 int maiorval = ent.nextInt();
		System.out.println("Digite o segundo valor: ");
		 int menorval = ent.nextInt();
	if (maiorval < menorval ) {
		System.out.println("o menor valor é: " + maiorval);
	}else {
	    System.out.println("o menor valor é: " + menorval);}
	if (maiorval > menorval) {
		System.out.println("o maior valor é: " + maiorval);
	}else{
		System.out.println("o maior valor é: " + menorval);}
	
		ent.close();

}

}