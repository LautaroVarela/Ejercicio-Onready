package vehiculos;

import java.text.DecimalFormat;

public class automovil extends VEHICULO{
	private int puertas;
	DecimalFormat precio = new DecimalFormat("$###,###.00");
	
	public automovil(String marca, String modelo, int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	
	public double getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public String toString() {
		return "Marca: " + super.getMarca() + " // " + "Modelo: " + this.getModelo() + " // " + "Puertas: " + this.puertas + " // " + "Precio: " + precio.format(this.getPrecio());
	}

	


}
