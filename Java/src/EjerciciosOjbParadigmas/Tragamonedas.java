package EjerciciosOjbParadigmas;

import java.util.HashSet;

public class Tragamonedas {

	/*
	 * Composición: contengo y uso otra clase, tengo un vector de objetos.
	 */
	Rodillo[] rodillos;
	
	
	public Tragamonedas() 
	{
		this(3);
	}
	
	public Tragamonedas(int cantidadRodillos) {
		rodillos = new Rodillo[cantidadRodillos]; ///para hacer un vector de tambores, los cuales la cantidad de rodillos me lo indica el parámetro
		for(int i = 0; i<rodillos.length;i++) {
			rodillos[i] = new Rodillo(); 
		}
		}
	
	/// HashSet guarda elementos únicos , no guarda duplicados
	/*
	 * Guardo todas las cosas 
	 */
	public boolean tirar() {
		HashSet<String> tirada = new HashSet<String>();  /// Este método lo vamos a ver después
		for(Rodillo rodillo : rodillos) 
		{
			tirada.add(rodillo.tirar()); /// agrega los elementos al conjunto de HashSet
			System.out.println(tirada + " ");
		}
		
		return tirada.size() == 1;
	}
	
	
	
	
}
