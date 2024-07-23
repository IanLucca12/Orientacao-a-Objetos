package tarefadia19;


public class Triangulo {

	private float perimetro,area;
	private lado l1,l2,l3;
	
	public Triangulo(float a ,float b , float c) {
		l1 = new lado(a);
		l2 = new lado(b);
		l3 = new lado(c);
	}
	
	public float getPerimetro() {
		return perimetro;
		
	}
	public float getAarea() {
		return area;
	}
	public float calcularArea() {
		area =(l1.getMedida()* l2.getMedida())/2;
		return area;
	}
	public float calcularPerimetro() {
		perimetro= l1.getMedida() + l2.getMedida() + l3.getMedida();
		return perimetro;
	}
	
	public String ehTriangulo() {
		int testea,testeb,testec;
		if (l2.getMedida()-l3.getMedida() < l1.getMedida() && l1.getMedida() <l2.getMedida()+l3.getMedida() ) {
			testea=1;
			}else {testea=0;}
		
		if (l1.getMedida()-l3.getMedida()<l2.getMedida() && l2.getMedida()< l1.getMedida()+l3.getMedida()) {
			testeb= 1;
			}else {testeb=0;}
		
		if (l1.getMedida()-l2.getMedida()<l3.getMedida() && l3.getMedida()<l2.getMedida()+l1.getMedida()) {
			testec=1;
			}else {testec=0;}
		
		if (testea==1 && testeb==1 && testec==1) {
			return ("É um triangulo");
		}else {return("Não é um triangulo");}
	}
}

