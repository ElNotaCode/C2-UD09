package ej5;

import java.util.HashMap;

//@Author ElNotaCode (Eloi Martorell) 18/04/2022

public class ej5App {
	
	public static void main(String[] args) {

		Aula aula = new Aula();
		System.out.println(aula);
		System.out.println(); //espacio
		//encontrar profesor
		Profesor profesor = new Profesor();
		System.out.println(profesor);
		System.out.println(); //espacio
		//poblar aula
		Estudiante estudiantes[] = new Estudiante[aula.getNumeroMaximoEstudiantes()];
		estudiantes = poblarAula(estudiantes);
		System.out.println();
		if(hayClase(aula, profesor, estudiantes)) {
			System.out.println();
			System.out.println("Se van a entregar las notas.");
			System.out.println("Alumnos aprovados: " + estudiantesAprovados('H',estudiantes));
			System.out.println("Alumnas aprovadas: " + estudiantesAprovados('M',estudiantes));
		}else {
			System.out.println("No hay clase.");
		}
		
	}
	
	//entregar notas
	public static int estudiantesAprovados(char sexo, Estudiante[] estudiantes) {
		int aprovados = 0;
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i].sexo == sexo) {
				if (estudiantes[i].nota >= 5) {
					aprovados++;
				}
			}
		}
		return aprovados;
	}
	
	//poblar aula de alumnos y profesor
	protected static Estudiante[] poblarAula(Estudiante[] estudiantes) {
		
		for (int i = 0; i < estudiantes.length; i++) {
			estudiantes[i] = new Estudiante();
			System.out.println(estudiantes[i]); //visualizamos
		}
		
		return estudiantes;
	}
	
	//mirar si el profesor está disponible y si puede dar clase
	
	public static boolean profesorDisponible(Aula aula, Profesor profesor) {
		System.out.println();
		if(aula.getMateriaAula() == profesor.getMateria()
				&& profesor.determinarAsistencia()) {
			System.out.println("El profesor puede realizar la clase.");
			return true;
		}else {
			System.out.println("El profesor no puede realizar clase.");
			return false;
		}
	}
	
	//si hay mas del 50 de alumnos
	public static boolean asistencia(Estudiante[] estudiantes) {
		
		//saber cual es el 50%
		double porcentaje = estudiantes.length * 0.50;
		int hanAsistido = 0;
		
		System.out.println();
		for (int i = 0; i < estudiantes.length; i++) {
			
			//guardar los que han asistido
			if(estudiantes[i].determinarAsistencia()) {
				System.out.println(estudiantes[i].nombre + " ha asistido.");
				hanAsistido++;
			}else {
				System.out.println(estudiantes[i].nombre + " FALTA.");
			}
			
		}
		
		//if los que han asistido > 50% = true
		if(hanAsistido > porcentaje) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//mirar si se da clase
	public static boolean hayClase(Aula aula, Profesor profesor, Estudiante[] estudiantes) {
		
		if (profesorDisponible(aula, profesor) && asistencia(estudiantes)) {
			return true;

		}else {
			return false;
		}
		
	}

}
