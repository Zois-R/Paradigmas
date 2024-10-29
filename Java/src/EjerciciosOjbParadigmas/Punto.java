package EjerciciosOjbParadigmas;



public class Punto {
	private double x; 
	private double y;
	
	
	public Punto(double newX, double newY) 
	{
		this.x = newX;
		this.y = newY;
	}
	
	public double obtenerX() 
	{
		return x; /// de que me sirve obtener si ya las variables tinene valores? Me sirve para encapsular mi código y para acceder
					/// a las variables desde fuera de la clase Punto,esto me da mantenibilidad e integridad de los datos.
	}
	
	public double obtenerY()
	{
		return y;
	}
	
	public void cambiarX(double nuevoX) 
	{
		this.x = nuevoX;
		
	}
	
	public void cambiarY(double nuevoY) 
	{
		this.y = nuevoY;
	}
	
	
	public boolean estaSobreEjeX() 
	{
		return x == 0 ? true:false;
	}
	
	
	public boolean estaSobreEjeY() 
	{
		return y == 0 ? true:false;
	}
	
	
	public boolean esElOrigen() 
	{
		return (x == 0) && (y == 0) ? true:false;
	}
	
	public double distanciaAlOrigen()
	{
		
		return Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
	}
	
	public double distanciaAotroPunto(Punto otro) 
	{
		double cuadDifX = Math.pow(otro.x-x, 2);
		double cuadDifY = Math.pow(otro.y-y, 2);
		
		return Math.sqrt(cuadDifX + cuadDifY);
		
	}
	
	public String toString() 
	{
		return "Coordenada en x: "+ this.x + "\nCoordenada en y: "+this.y;
	}
}

/*
 * Usar this asegura que estás accediendo al atributo de la instancia, no a la variable local o parámetro.
 */

/*
La diferencia clave entre atributo y variable local es que el atributo tiene alcance en toda la clase y la variable local 
solo al metodo.
*/