package ej1;

//@Author ElNotaCode (Eloi Martorell) 18/04/2022

public class Lavadora extends Electrodomestico {

	protected int carga; //normalmente los valores de este tipo suelen estar redondeados, por lo que voy a usar un int
	
	protected int CARGA = 5;

	//por defecto
	protected Lavadora() {
		this.carga = CARGA;
	}
	
	protected Lavadora(double precioBase, double peso) {
		super(precioBase,peso);
		this.carga = CARGA;
	}
	
	//constructor con todo
	protected Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase,color,consumoEnergetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	protected void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public String toString() {
		return "Lavadora [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", carga=" + carga + "]";
	}
	
	//sobrecarga precioFinal
	protected double precioFinal() {

		double precioFinal = this.precioBase;
		double peso = this.peso; //lo he tenido que cambiar y esto va a ser mas rápido

		switch (this.consumoEnergetico) {
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
			
			if (this.carga > 30) {
				precioFinal += 50;
			}
				
		return precioFinal;

	}
	
}
