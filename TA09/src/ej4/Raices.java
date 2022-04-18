package ej4;

public class Raices {

	double a;
	double b;
	double c;
	
	protected Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminante() {
		
		double discriminante = (b*b)-(4*a*c);
		
		return discriminante;
		
	}
	
	public boolean tieneRaices(Double discriminante) {
		
		if (discriminante >= 0) {
			return true;
		}else {
			return false;	
		}
		
	}
	
	public boolean tieneRaiz(Double discriminante) {
		
		if (discriminante == 0) {
			return true;
		}else {
			return false;	
		}
	}
	
	public void calcular() {
		
		double parte1 = getDiscriminante();
		//System.out.println(parte1);
		if(tieneRaiz(parte1)) {
			parte1 = Math.sqrt(parte1);
			obtenerRaiz();
		}else if(tieneRaices(parte1)) {
			parte1 = Math.sqrt(parte1);
			obtenerRaices(parte1);
		}else {
			System.out.println("No tiene solución.");
		}
		
	}
	
	public void obtenerRaices(double parte1) {
		double valorPositivo = (-b + parte1)/(2*a);
		System.out.println("Valor Positivo = " + valorPositivo);
		double valorNegativo = (-b - parte1)/(2*a);
		System.out.println("Valor Negativo = " + valorNegativo);
	}
	
	public void obtenerRaiz(){
		double valor = -b/2;
		System.out.println("Solo tiene una solución = " + valor);
	}

	@Override
	public String toString() {
		return "Raices [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
}
