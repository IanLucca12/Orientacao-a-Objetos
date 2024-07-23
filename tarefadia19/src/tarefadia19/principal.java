package tarefadia19;

public class principal {
private static Triangulo t1;
private static Triangulo t2;
private static Triangulo t3;

	
	
	public static void main(String[] args) {
		
		t1 = new Triangulo(6,7,8);
		t2 = new Triangulo(7,4,6);
		t3 = new Triangulo(2,4,8);
		
	System.out.println(t1.calcularArea());
	System.out.println(t2.calcularArea());
	System.out.println(t3.calcularArea());
	System.out.println(t1.ehTriangulo());
	System.out.println(t2.ehTriangulo());
	System.out.println(t3.ehTriangulo());

	}

}
