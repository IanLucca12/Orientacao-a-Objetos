package aula2;
import java.util.Scanner;


public class tarefacasa2 {

	public static void main(String[] args) {
		float a;
		float b;
		float c;
		float d;
		float h;
		float r;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite C/c para o circulo, digite q/Q para quadrado, digite t/T para trapézio, digite R/r para retãngulo ");
		ch = sc.next().charAt(0);
		
		
		
		if (ch == 'R'|| ch =='r') {
			System.out.println("informe um número  para o lado a :");
			a = sc.nextFloat();
			System.out.println("informe um número  para o lado b :");
			b = sc.nextFloat();
			System.out.println("O perímetro do retângulo é:" + (2*a + 2*b) +  "A área do retângulo é:" + a*b);
		}
		
		if (ch == 'Q'|| ch =='q') {
			System.out.println("informe um número  para o lado a :");
			a = sc.nextFloat();
			System.out.println("O perímetro do quadrado é:" + (4*a) +  "A área do quadrado é:" + a*a);
		}
		
		if (ch == 'T'|| ch =='t') {
		System.out.println("informe um número  para o lado a :");
		a = sc.nextFloat();
		System.out.println("informe um número  para o lado b :");
		b = sc.nextFloat();
		System.out.println("informe um número  para o lado c :");
		c = sc.nextFloat();
		System.out.println("informe um número  para o lado d :");
		d = sc.nextFloat();
		System.out.println("informe um número  para a altura :");
		h = sc.nextFloat();
		System.out.println("O perímetro do trapézio é:" + (a+b+c+d) +  "A área do retângulo é:" + ((a+b)*h)/2);}
		
		if (ch == 'C'|| ch =='c') {
			System.out.println("informe um número  para raio :");
			r = sc.nextFloat();
			System.out.println("O perímetro do retângulo é:" + (2*3.14*r) + "A área da circunferência é:" + (3.14*(r*r)));
		}
		
		if (ch != 'C'|| ch !='c' || ch!= 'T'|| ch !='t' || ch !='Q' || ch!='q' || ch!='R' || ch!='r') {
			System.out.println("Digite um caracter válido");
		}
	}

}
