package ej1;

//@Author ElNotaCode (Eloi Martorell) 16/04/2022

public class Ej1App {
	
	static Electrodomestico electrodomesticos[] = new Electrodomestico[10];
	
	public static void main(String[] args) {

		rellenarArrays();
		double precioElectrodomesticos = 0;
		double precioLavadoras = 0;
		double precioTv = 0;
		for (int i = 0; i < electrodomesticos.length; i++) {
			precioElectrodomesticos += electrodomesticos[i].precioFinal();
			//System.out.println(electrodomesticos[i].getClass());
			if (electrodomesticos[i].getClass() == Lavadora.class) {
				precioLavadoras += electrodomesticos[i].precioFinal();
			}else if (electrodomesticos[i].getClass() == Television.class) {
				precioTv += electrodomesticos[i].precioFinal();
			}
		}
		System.out.println("Precio de los electrodomésticos: " + precioElectrodomesticos);
		System.out.println("Precio de las Lavadoras: " + precioLavadoras);
		System.out.println("Precio de las TVs: " + precioTv);
	}
	
	public static void rellenarArrays() {
		//super(precioBase,color,consumoEnergetico, peso);
		
		electrodomesticos[0] = new Electrodomestico();
		electrodomesticos[1] = new Electrodomestico(10,10);
		electrodomesticos[2] = new Electrodomestico(40,20);
		electrodomesticos[3] = new Electrodomestico(40,"OCRE",'Z',20);
		electrodomesticos[4] = new Electrodomestico(10,"azul",'A',40);
		electrodomesticos[5] = new Lavadora(90,"BLAnco",'B',40,40);
		electrodomesticos[6] = new Lavadora(65,"Rojo",'D',55,20);
		electrodomesticos[7] = new Television();
		electrodomesticos[8] = new Television(22,20);
		electrodomesticos[9] = new Television(50,"rojo",'F',35,50,true);
	}

}
