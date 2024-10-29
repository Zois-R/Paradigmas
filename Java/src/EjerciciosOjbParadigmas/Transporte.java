package EjerciciosOjbParadigmas;

public class Transporte {

	private int pesoTotal = 0;
	private int cantidadPaquetes = 0;
	
	private double pesoMaximo;
	private double distanciaMaxima;
	private int paquetesMaximo;
	
	
	public Transporte(double pesoMaximo, double distanciaMaxima, int paqueteMaximo) {
		this.pesoMaximo = pesoMaximo;
		this.distanciaMaxima = distanciaMaxima;
		this.paquetesMaximo = paqueteMaximo;
	}
	
	public boolean puedeLlevar(Paquete paq) 
	{
		return paq.tam <= (this.pesoMaximo - this.pesoTotal) &&
				paq.distancia <= this.distanciaMaxima &&
				cantidadPaquetes < this.paquetesMaximo;
	}
	

//	public boolean cargar(Paquete paq) 
//	{
//		if(puedeLlevar(paq)) 
//		{
//			
//		}
//	}
	
}
