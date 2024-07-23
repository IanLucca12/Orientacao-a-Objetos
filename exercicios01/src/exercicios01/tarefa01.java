package exercicios01;

import java.util.Scanner;

public class tarefa01 {

	public static void main(String[] args) {
		int a,b;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("informe um número inteiro para a :");
		a = sc.nextInt();
		System.out.println("informe um número inteiro para b :");
		b = sc.nextInt();
		
		c = a+b;
		System.out.println("a + b =" + c);
		
		c=a-b;
		System.out.println("a - b =" + c);
		
		c= a*b;
		System.out.println("a * b =" + c);
		
		c=a%b;
		System.out.println("a / b =" + c);
		
		c=a^b;
		System.out.println("a ^ b =" + c);
		
	}

}
