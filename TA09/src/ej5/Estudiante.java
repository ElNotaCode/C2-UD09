package ej5;

import java.util.Random;

//@Author ElNotaCode (Eloi Martorell) 18/04/2022

public class Estudiante extends Persona{

	protected int nota;
	
	//por defecto
	protected Estudiante() {
		this.edad = generarEdad();
		this.nota = generarNota();
	}
	
	//determinar todo
	protected Estudiante(String nombre, int edad,char sexo, int nota) {
		super(nombre,edad,sexo);
		this.nota = nota;
	}
	
	protected int generarEdad() {
		Random r = new Random();
		return r.nextInt(5) + 11;
	}
	
	private int generarNota() {
		Random r = new Random();
		return r.nextInt(11);
	}

	@Override
	protected boolean determinarAsistencia() {
		Random r = new Random();
		return r.nextBoolean(); //50%
	}

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
}