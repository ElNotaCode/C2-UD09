package ej5;

import java.util.Random;

//@Author ElNotaCode (Eloi Martorell) 18/04/2022

public class Profesor extends Persona {

	protected String materia;
	
	protected String materias[] = new String[3]; //duda: esto se consideraría constante,
	//por tanto tendría que ir con mayus?
	
	//autogenerado
	protected Profesor() {
		this.edad = generarEdad();
		this.materia = generarMateria();
	}
	
	//con todos los parametros
	protected Profesor(String nombre, int edad,char sexo, String materia) {
		super(nombre,edad,sexo);
		this.materia = materia;
	}
	
	private String generarMateria() {
		Random r = new Random();
		cargarArray();
		return materias[r.nextInt(materias.length)];
	}
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	protected boolean determinarAsistencia() {

		Random r = new Random();
		if ((r.nextInt(101)+1) > 20) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	protected int generarEdad() {
		Random r = new Random();
		return r.nextInt(44) + 22;
	}
	
	private void cargarArray() {
		materias[0] = "Matematicas";
		materias[1] = "Filosofia";
		materias[2] = "Fisica";
	}

	
	@Override
	public String toString() {
		return "Profesor [materia=" + materia  + ", nombre=" + nombre
				+ ", edad=" + edad + ", sexo=" + sexo + "]";
	}

	
}
