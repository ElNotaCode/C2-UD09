package ej4;

public class Ej4App {

	public static void main(String[] args) {
		// ejercicios: https://www.youtube.com/watch?v=IGhjsc8lEKY
		Raices ejercicio1 = new Raices(1,1,-2);
		System.out.println("Ejercicio 1: " + ejercicio1);
		ejercicio1.calcular();
		
		System.out.println();
		Raices ejercicio2 = new Raices(2,-5,3);
		System.out.println("Ejercicio 1: " + ejercicio2);
		ejercicio2.calcular();
		
		System.out.println();
		Raices ejercicio3 = new Raices(1,-1,1);
		System.out.println("Ejercicio 1: " + ejercicio3);
		ejercicio3.calcular();
		
		//ejercicio 4 con una sol.
		//https://www.superprof.es/apuntes/escolar/matematicas/algebra/ecuaciones/ejercicios-ecuaciones-de-segundo-grado.html
		System.out.println();
		Raices ejercicio4 = new Raices(1,-2,1);
		System.out.println("Ejercicio 1: " + ejercicio4);
		ejercicio4.calcular();
	}

}
