/*se visualiza lo siguiente por consola y se termina la ejecuci�n:

Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50
=============================
Veh�culo m�s caro: Peugeot 208
Veh�culo m�s barato: Honda Titan
Veh�culo que contiene en el modelo la letra �Y�: Yamaha YBR $80.500,50

Ejercicio extra:
=============================
Veh�culos ordenados por precio de mayor a menor:
Peugeot 208
Peugeot 206
Yamaha YBR
Honda Titan

Requisitos:
	- Soluci�n orientada a objetos.
	- Salida es por consola.
	- Clases provistas por Java 8.
	- Cargar la lista de autos en un �nico m�todo. No hay ingreso por pantalla de ning�n tipo.
	- El algoritmo usado para la impresi�n no tiene que depender de la cantidad, modelo o tipo de autos
	- El entregable deber� ser la URL de un repositorio Git p�blico.
*/
package main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import vehiculos.VEHICULO;
import vehiculos.motocicleta;
import vehiculos.automovil;


@SuppressWarnings("unused")
public class MAIN{
	
       public static void main(String[] args) {
    	   DecimalFormat precio = new DecimalFormat("$###,###.00");
    	   
    	   ArrayList<VEHICULO> vehiculos = new ArrayList<>();
		
		vehiculos.add(new automovil("Peugeot", "206", 4, 200000.00));
		vehiculos.add(new motocicleta("Honda", "Titan", 125, 60000.00));
		vehiculos.add(new automovil("Peugeot", "208", 5, 250000.00));
		vehiculos.add(new motocicleta("Yamaha", "YBR", 160, 80500.50));
		
		
		
						
      
		 for (VEHICULO lista : vehiculos) {
	            System.out.println(lista);
	}				
		// ORDENACION_POR_PRECIO MayorAMenor = new ORDENACION_POR_PRECIO();

        /*if ((V1.getPrecio()>V2.getPrecio()) && (V2.getPrecio()>V3.getPrecio()) && (V3.getPrecio()>V4.getPrecio())){
	                    
        	 ORDENACION_POR_PRECIO.compare(V1, V2, V3, V4);*/
							
						
}
       
       }

						
						
						
						
						
		
	
       

