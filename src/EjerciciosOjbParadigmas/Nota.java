package EjerciciosOjbParadigmas;

public class Nota {
	private double nota;
	
	
	public double obtenerNota() 
	{
		return nota;
	}
	
	public void setearNota(double n) 
	{
		/// aca se hacen las validaciones de datos?
		if(n >=0 && n<=10)
			this.nota = n;
		else
			System.out.println("Error de ingreso");
	}
	
	public void cambiarNota(double nuevaNota) 
	{
		if(nuevaNota > this.nota  && nuevaNota <=10)
			this.nota = nuevaNota;
	}
	
}
