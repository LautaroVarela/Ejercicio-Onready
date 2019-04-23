package vehiculos;

import java.text.DecimalFormat;

public class motocicleta extends VEHICULO {
	private int cilindrada;
	private String modelo;
	DecimalFormat precio = new DecimalFormat("###,###.00");
	
	public motocicleta(String marca, String modelo, int cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String toString() {
		return "Marca: " + super.getMarca() + " // " + "Modelo: " + super.getModelo() + " // " + "Cilindrada: " + this.cilindrada + "c // " + "Precio: $" + precio.format(this.getPrecio());
	}

	

}
