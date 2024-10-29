package EjerciciosOjbParadigmas;

public class Bicicleta extends Transporte {

	/// si borro todo funciona
	/// cuando extiendo se lleva todos los métodos de la clase padre
	/// Cuando heredo tambien tengo que heredar el constructor, si en el padre no tengo uno vació
	/// me tira errror, tengo que definir el constructor en la clase hija
	
	public Bicicleta() 
	{
		super(10,2,1); /// no quiero que reciba parametros el constructor
	}
	
	
	

	
//	public boolean puedeLlevar(Paquete paq) 
//	{
//	
//		if(paq.tam >2  && paq.tam<0)
//			return false;
//		if(paq.distancia >10 && paq.distancia >= 0)
//			return false;
//		return true;
//	}
}
