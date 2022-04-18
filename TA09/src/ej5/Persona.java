package ej5;

import java.util.Random;

//@Author ElNotaCode (Eloi Martorell) 18/04/2022

public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected char sexo;
	
	static String arrayNombresHombre[] = new String[10];
	static String arrayNombresMujer[] = new String[10];
	
	//auto generado
	protected Persona() {
		this.sexo = generarSexo();
		this.nombre = generarNombre(sexo);
		this.edad = 0;
		
	}

	protected Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	//metodos a implementar:
	protected abstract boolean determinarAsistencia();
	
	protected abstract int generarEdad();
	
	//sexo aleatorio
	private char generarSexo() {
		
		Random r = new Random();
		
		if (r.nextBoolean()) {
			return 'H';
		}else {
			return 'M';
		}

	}
	
	//mirará el sexo
	private String generarNombre(char sexo) {
		
		if(sexo == 'M') {
			
			rellenarArrayMujeres();
			
			return nombreAleatorio(arrayNombresMujer);
		}else if (sexo == 'H') {
			rellenarArrayHombres();
			return nombreAleatorio(arrayNombresHombre);
		}else {
			return "ERROR";
		}
		
	}
	
	//dependiendo del sexo carga un array y elige un nombre
	private String nombreAleatorio(String[] array) {
		
		Random r = new Random();
		return array[r.nextInt(array.length)];
		
	}
	
	//metodos para rellenar los array
	private void rellenarArrayHombres() {
		
		arrayNombresHombre[0] = "Guts";
		arrayNombresHombre[1] = "Walter";
		arrayNombresHombre[2] = "Leboswki";
		arrayNombresHombre[3] = "Gustabo";
		arrayNombresHombre[4] = "Horacio";
		arrayNombresHombre[5] = "Cid";
		arrayNombresHombre[6] = "Barbados";
		arrayNombresHombre[7] = "McCoolface";
		arrayNombresHombre[8] = "Echo";
		arrayNombresHombre[9] = "Hunter";
		
	}
	
	private void rellenarArrayMujeres() {
		
		arrayNombresMujer[0] = "Cristina";
		arrayNombresMujer[1] = "Theresia";
		arrayNombresMujer[2] = "Claudia";
		arrayNombresMujer[3] = "Paula";
		arrayNombresMujer[4] = "Andrea";
		arrayNombresMujer[5] = "Ellie";
		arrayNombresMujer[6] = "Sara";
		arrayNombresMujer[7] = "Veronica";
		arrayNombresMujer[8] = "Julia";
		arrayNombresMujer[9] = "Ana";

	}


}
