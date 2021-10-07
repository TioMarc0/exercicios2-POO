import java.util.Scanner;

public class media{
public static void main(String args[])
{

		Scanner ent = new Scanner(System.in);
			float n1 = 0;
			float n2 = 0;
			float nf = 0;
			
			System.out.print("primeira nota: ");
			n1 = ent.nextFloat();
			System.out.print("segunda nota: ");
			n2 = ent.nextFloat();
			nf = (n1 + n2)/2;
		if(nf >=7) {
			System.out.print(nf + "Voce foi APROVADO. " );
		} else {
			System.out.print(nf + "Voce foi REPROVADO. ");}
		ent.close();
		}
	
}
