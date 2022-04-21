package ej6;

import java.util.Iterator;


import dto.Cine;
import dto.Espectador;
import dto.Pelicula;
//Eloi Martorell 
//Marc Lopez
//21/04/2022

public class App{


	public static void main(String[] args) {

		//cine con precio entrada:
		Cine cine = new Cine(7);
		Pelicula p = new Pelicula("Batamanta man",130, 16, "Loulogio");
		
		
		//"entra la gente" generamos x cantidad de pesonas
		Espectador e[] = new Espectador[60];
		
		System.out.println("Espectadores que vienen al Cine");
		System.out.println();
		
		for (int i = 0; i < e.length; i++) {
			e[i] = new Espectador();
			System.out.println(e[i]);
		}
		System.out.println();
		System.out.println("Sala de Cine");
		//mostramos los asientos
		cine.mostrarAsientos();
		System.out.println();
		System.out.println();
		
	
		System.out.println("Espectadores que tenian el dinero y la edad permitida");
		System.out.println();
		//"compran las entradas" miramos si tienen el dinero y la edad
		int espectadores = 0;
		for (int i = 0; i < e.length; i++) {
			if(cine.comprobarEdad(p,e[i].getEdad()) && cine.comprobarDinero(e[i].getDinero())) {
				System.out.println(e[i].getNombre()+"tiene "+e[i].getDinero()+"€ con edad "+e[i].getEdad());
				espectadores++;
			}
		}
		
		
		
		System.out.println();
		System.out.println("Sala de Cine con Espectadores "+espectadores);
		
		//si pueden entrar buscan asiento && //mostramos los asientos ocupados
		cine.buscarAsiento(espectadores);
		
	}
	

}
