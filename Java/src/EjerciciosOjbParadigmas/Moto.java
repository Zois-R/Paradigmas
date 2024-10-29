package EjerciciosOjbParadigmas;

public class Moto extends Transporte{

//	private int paquetesMaximo;
//	private int cantidadPaquetes = 0;
//	
	
	/// puede llevar hasta 3 paquetes
	/// 50 kg en total
	/// 15 km;
	
	public Moto() 
	{
		super(50,15,3);
		///paquetesMaximo = 3; tiene que estar el super antes
	}
	
	
	///MODIFICADORES DE ACCESO
	
	/*
	 * Con relaciones de herencia no privado sino protegido 
	 * 
	 PUBLICO: Puedo acceder desde cualquier lado
	 SINO PONGO NADA: Puedo acceder desde el paquete, entre otros paquetes no se puede ver
	 PROTECTED : Es por paquete, los hijos lo pueden ver.
	 
	 Si son solo 2 clases no tiene sentido hacer HERENCIA
	 Es a partir de la 3 clase que tiene sentido hacerla.
	 
	 
	 Si el abuelo tiene una función la cual el padre no la tiene definida, entonces el nieto
	 puede acceder a la del abuelo.Es la 
	 */
	
	
	
	
	
	
	
	
	
	
	
//	private int pesoTotal = 0;
//	private int cantidadPaquetes = 0;
//	public boolean puedeLlevar(Paquete paq) 
//	{
//	
//		if(paq.tam >0  && paq.tam< (50-pesoTotal))
//			return false;
//		if(paq.distancia >15 && paq.distancia >= 0)
//			return false;
//		if(cantidadPaquetes < 3)
//			return false;
//		return true;
//	}
//	
//	
//	public boolean cargar(Paquete paq) {
//		if(puedeLlevar(paq)) 
//		{
//			
//			pesoTotal += paq.tam;
//			
//			if(pesoTotal <0)
//				return false;
//			
//			cantidadPaquetes++;
//			return true;
//		}
//		return false;
//		
//	}

}

