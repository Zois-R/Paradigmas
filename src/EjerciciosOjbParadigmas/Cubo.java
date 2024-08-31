package EjerciciosOjbParadigmas;

public class Cubo {
	
	private double lado;
	
	public double obtenerLado() 
	{
		return lado;
	}
	
	public void setearLado(double l) 
	{
		this.lado = l;
	}
	
	public double obtenerVolumen() 
	{
		return lado*lado*lado;
	}
	
	
	
}
