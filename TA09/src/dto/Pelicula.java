package dto;

public class Pelicula {
	
	//Eloi Martorell 
		//Marc Lopez
		//21/04/2022
	
	String titulo;
	int duracion;
	int edadMinima;
	String director;
	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}


	@Override
	public String toString() {
		return "Pelicula és  [titulo=" + titulo + ", con la  duracion" + duracion + ",la  edad minima es " + edadMinima + ", director="
				+ director + "]";
	}
	
	
	
	
	

}
