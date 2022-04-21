package dto;
//Eloi Martorell 
//Marc Lopez
//21/04/2022
public class Cine {

		
	private int precioEntrada = 7;

	static private int[] filas = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static private String[] columnas = { "A-", "B-", "C-", "D-", "E-", "F-", "G-", "H-", "I-" };

	public Cine(int precioEntrada) {
		super();
		this.precioEntrada = precioEntrada;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	
	public int[] getFilas() {
		return filas;
	}

	public void setFilas(int[] filas) {
		this.filas = filas;
	}

	public String[] getColumnas() {
		return columnas;
	}

	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	public void mostrarAsientos() {

		for (int i = 0; i < filas.length; i++) {
			for (int j = 0; j < columnas.length; j++) {
				if (columnas[j].charAt(0) == 'A') {
					System.out.println("");

				}
				System.out.print(filas[i] + columnas[j] + " ");
			}
		}

	}

	//comprobar si el usuario puede comprar la entrada
	public boolean comprobarDinero(int dinero) {
		
		boolean cmdinero =  false;
		if(dinero >= precioEntrada ) {
			cmdinero = true;
			
		}
		
		return cmdinero;

	}

	//comprobar si el usuario tiene la edad correcta

	public boolean comprobarEdad(Pelicula p,int edad) {
		
		boolean cmedad =  false;
		
		if(edad >= p.getEdadMinima() ) {
			cmedad = true;
			
		}

		
		
		
		return cmedad;

	}
	
	public static void buscarAsiento(int espectadores) {
		String[] columnasX = { "AX", "BX", "CX", "DX", "EX", "FX", "GX", "HX", "IX" };
		int contador = 0;
		
		for (int i = 0; i < filas.length; i++) {
			for (int j = 0; j < columnas.length; j++) {
				if (columnas[j].charAt(0) == 'A') {
					System.out.println("");

				}
				if(contador < espectadores) {
					System.out.print(filas[i] + columnasX[j] + " ");
					contador++;
				}else {
					System.out.print(filas[i] + columnas[j] + " ");
				}
				
			}
		}
		
	}

}