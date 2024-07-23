package tarefa02;
import java.util.Scanner;
import java.math.*;

public class atividade2 {

	public static void main(String[] args) {
		float a;
		float b;
		float c;
		int testea,testeb,testec;
		double l1;
		double l2;
		double hip;
		char tipo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe um número  para o lado a :");
		a = sc.nextFloat();
		
		System.out.println("informe um número  para o lado b :");
		b = sc.nextFloat();
		
		System.out.println("informe um numero para o lado c :");
		c = sc.nextFloat();
		
		System.out.println("Digite R/r para retângulo ou digite T/t para triângulo :");
		tipo= sc.next().charAt(0);
		
		System.out.println("informe um numero para o lado 1 :");
		l1 = sc.nextDouble();
		
		System.out.println("informe um numero para o lado 2 :");
		l2 = sc.nextDouble();
		
		
		if (b-c < a && a <b+c ) {
			testea=1;
			}else {testea=0;}
		
		if (a-c<b && b< a+c) {
			testeb= 1;
			}else {testeb=0;}
		
		if (a-b<c && c<b+a) {
			testec=1;
			}else {testec=0;}
		
		if (testea==1 && testeb==1 && testec==1) {
			System.out.println("É um triângulo!");
		}else {System.out.println("Não é um triângulo");}
		
		if (tipo == 'R'|| tipo =='r') {
			System.out.println("O perímetro do retângulo é:" + (2*l1 + 2*l2)+ "A área do retângulo é:" + l1*l2);
		}
		
		if (tipo== 'T' || tipo == 't') {
			hip= Math.sqrt((l1*l1) + (l2*l2));
			
			System.out.println("O perímetro do retângulo é:" + (hip+l1+l2)+ "A área do retângulo é:" + (l1*l2/2));
}

	} 

}
