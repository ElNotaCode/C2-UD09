package ej1;

public class Television extends Electrodomestico {

	protected int resolucion;
	protected boolean tdt;
	
	protected int PULGADAS = 20;
	protected boolean TDT = false;
	
	//por defecto
	protected Television() {
		this.resolucion = PULGADAS;
		this.tdt = TDT;
	}
	
	protected Television(double precioBase, double peso) {
		super(precioBase,peso);
		this.resolucion = PULGADAS;
		this.tdt = TDT;
	}
	
	protected Television(double precioBase, String color, char consumoEnergetico, double peso, int pulgadas, boolean tdt) {
		super(precioBase,color,consumoEnergetico,peso);
		this.resolucion = pulgadas;
		this.tdt = tdt;
	}
	
	
	//geters
	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	//metodo que pide implementar
	protected double precioFinal() {

		double precioFinal = this.precioBase;
		double peso = this.peso;
		
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
			
			if (resolucion > 40) {
				precioFinal += (precioFinal * 0.30);
			}
			
			if (TDT) {
				precioFinal += 50;
			}
				
		return precioFinal;

	}
	
	@Override
	public String toString() {
		return "Lavadora [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", resolucion=" + resolucion + ", tdt=" + tdt + "]";
	}
	
}
