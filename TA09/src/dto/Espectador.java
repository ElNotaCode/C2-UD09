package dto;

import java.util.Random;

//Eloi Martorell 
//Marc Lopez
//21/04/2022

public class Espectador {
	
	//variables
	String nombre;
	int edad;
	int dinero;
	
	//constantes para pasar por parametro edad max y min y dinero max y min
	int EDADMAX = 70;
	int EDADMIN = 7;
	int DINEROMAX = 21;
	int DINEROMIN = 2;
	
	static String arrayNombresHombre[] = new String[10];
	static String arrayNombresMujer[] = new String[10];
	
	//constructor por defecto
	public Espectador() {
		this.nombre = generarNombre();
		this.edad = generarInt(EDADMIN, EDADMAX);
		this.dinero = generarInt(DINEROMIN,DINEROMAX);
	}
	
	//contructor con todos los parametros, no tenemos pensado usarlo pero por si acaso
	public Espectador(String nombre, int edad, int dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	//metodo nombre
	private String generarNombre() {
		
		Random r = new Random();
		if(r.nextBoolean()){
			rellenarArrayHombres();
			r = new Random();
			return arrayNombresHombre[r.nextInt(arrayNombresHombre.length)];
			
		}else {
			rellenarArrayMujeres();
			r = new Random();
			return arrayNombresMujer[r.nextInt(arrayNombresMujer.length)];
		}
		
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

	//metodo int
	private int generarInt(int min, int max) {
		Random r = new Random();
		return r.nextInt(max + 1 - min) + min;
	}

	@Override
	public String toString() {
		return   nombre + " tiene " + edad + " años, dispone de " + dinero + "€";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	
	
}
