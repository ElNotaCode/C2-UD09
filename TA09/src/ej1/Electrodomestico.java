package ej1;

//@Author ElNotaCode (Eloi Martorell) 16/04/2022

public class Electrodomestico {

	//precioBase color consumoEnergetico (A-F) peso
	//usaremos protected porque se pueden heredar

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	//CONSTANTES
	protected double PRECIOBASE = 100;
	protected String COLOR = "BLANCO";
	protected char CONSUMOENERGETICO  = 'F';
	protected double PESO = 5;

	//enums
	enum Consumo{A,B,C,D,F}

	enum Color{BLANCO,NEGRO,ROJO,AZUL,GRIS}

	//por defecto
	protected Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = PESO;
	}

	//precioBase y peso el resto por defecto
	protected Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = peso;
	}

	//constructor al completo con los metodos para comprobar
	protected Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso +"]";
	}

	//Getters y setters

	protected void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	//metodo comprobar letra se invocará al crear el objeto y no será visible

	private char comprobarConsumoEnergetico(char letra){

		boolean check;
		letra = Character.toUpperCase(letra);

		switch (letra) {
		case 'A':
			check = true;
			break;
		case 'B':
			check = true;
			break;
		case 'C':
			check = true;
			break;
		case 'D':
			check = true;
			break;
		case 'E':
			check = true;
			break;
		case 'F':
			check = true;
			break;
		default:
			check = false;
			break;
		}

		if (check) {
			return letra;
		}else {
			return CONSUMOENERGETICO;
		}

	}

	//metodo comprobar color se invocará al crear el objeto y no será visible

	private String comprobarColor(String color) {

		color = color.toUpperCase();
		boolean check;

		//Color{BLANCO,NEGRO,ROJO,AZUL,GRIS}
		switch (color) {
		case "BLANCO":
			//return true; //antes lo tenía así pero da error
			check = true;
			break;
		case "NEGRO":
			check = true;
			break;
		case "ROJO":
			check = true;
			break;
		case "AZUL":
			check = true;
			break;
		case "GRIS":
			check = true;
			break;
		default:
			check = false;
			break;
		}

		if (check) {
			return color;
		}else {
			return COLOR;
		}

	}

	//precio final segun el consumo y el tamaño aumenta su precio
	protected double precioFinal(char letra, double peso,double precioBase) {

		double precioFinal = precioBase;

		switch (letra) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 10;
			break;

		}
			
			if (peso < 20) {
				precioFinal += 10;
			}else if(peso >= 20 || peso < 50){
				precioFinal += 50;
			}else if(peso >= 50 || peso < 80){
				precioFinal += 80;
			}else if(peso > 80){
				precioFinal += 100;
			}
				
		return precioFinal;

	}

}
