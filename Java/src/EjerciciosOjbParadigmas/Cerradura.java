package EjerciciosOjbParadigmas;

public class Cerradura {
	
		private int clave;
		private int cantFallos;
		private boolean estado = false; /// abierto true, cerrado false
		private int contFallos = 0;
		private int contAperturasExitosas = 0;
	    public Cerradura(int claveDeApertura,
	                     int cantidadDeFallosConsecutivosQueLaBloquean)
	    {
	    	clave = claveDeApertura;
	    	cantFallos = cantidadDeFallosConsecutivosQueLaBloquean;
	    }
	    public boolean abrir(int clave) 
	    {
	    	if(this.estado == true) // ya esta abierta no quiero contar aperturas exitosas
	    	{
	    		System.out.println("Ya esta abierta");
	    		return true;
	    	}
	    	if(fueBloqueada() == true) 
	    	{
	    		throw new IllegalArgumentException("No se pueden realizar mas intentos"
	    				+ ", la tarjeta fue bloqueada");
	    	}
	    	
	    	if(clave == this.clave) 
	    	{
	    		estado = true;
	    		contAperturasExitosas++;
	    		return true;
	    	}
	    		
	    	this.contFallos++;
	    	return false;
	    }
	    
	    public void cerrar() 
	    {
	    	this.estado = false;
	    }
	    public boolean estaAbierta()
	    {
	    	if(this.estado == true)
	    		return true;
	    	return false;
	    }
	    public boolean estaCerrada() 
	    {
	    	if(this.estado == false)
	    		return true;
	    	return false;
	    }
	    public boolean fueBloqueada() 
	    {
	    	if(this.cantFallos == contFallos)
	    		return true;
	    	return false;
	    }
	    public int contarAperturasExitosas() 
	    {
	    	return contAperturasExitosas;
	    }
	    public int contarAperturasFallidas()
	    {
	    	return contFallos;
	    }
}
