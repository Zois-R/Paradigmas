package EjerciciosOjbParadigmas;

public class Nota {
	private int nota;
	
	///Es buena practica en el constructor poner restricciones?
	public Nota(int valorInicial) {
    	this.nota = valorInicial;
    }
	
	 /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() {
    	// completar
    	return nota;
    }
	
    public boolean aprobado() {
    	if(this.nota >= 4)
    		return true;
    	return false;
    }
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
    	if(this.nota <4)
    		return true;
    	return false;
    }
    
    /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo
     *       por nuevoValor, siempre y cuando nuevoValor sea superior al
     *       valor numérico actual de la Nota.
     */
    public void recuperar(int nuevoValor)
    {
    	if(nuevoValor > this.nota) 
    	{
    		this.nota = nuevoValor;
    	}
    }
	
    public String toString() 
    {
    	return "La nota es "+nota;
    }
    
}
