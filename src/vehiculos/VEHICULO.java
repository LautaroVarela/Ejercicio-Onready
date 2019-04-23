package vehiculos;

public abstract class VEHICULO implements Comparable <VEHICULO> {
	private String marca;
	private String modelo;
	private double precio;
	
	public VEHICULO(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int compareTo(VEHICULO VEHICULO) {
		int resultado = 0;
		
		if(this.precio > VEHICULO.getPrecio()) {
			resultado = -1;
		}else if (this.precio < VEHICULO.getPrecio()) {
			resultado = 1;
		}else {
			resultado = 0;
		}
		return resultado;
		
		
	}


	
	
	

}
