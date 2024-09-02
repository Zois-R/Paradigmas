package EjerciciosOjbParadigmas;

public class Cubo {
	
	private double lado;
	// completar
	
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) {
    	
    	if (longitudLado <= 0) {
            throw new IllegalArgumentException("El tamaño del lado debe ser mayor a 0.");
        }
        this.lado = longitudLado;
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
    	// completar
    	return lado;
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
    	if(longitudLado <= 0)
    		throw new IllegalArgumentException("El tamaño del nuevo lado debe ser mayor a 0.");
    	this.lado = longitudLado;
    }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
    	// completar
    	return lado*lado;
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
    	if(areaCara <= 0)
    		throw new IllegalArgumentException("El valor del nuevo area es menor a cero");
    	this.lado = Math.sqrt(areaCara);
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
    	
    	return lado*lado*lado;
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
    	/*
    	 volumen = Math.pow(lado,3);
    	 lado = Math.sqrt(volumen,2);
    	 */
    	if(volumen <=0)
    		throw new IllegalArgumentException("El valor del volumen es menor a 0 ");
    	lado = Math.cbrt(volumen);
    }
	
    public String toString() 
    {
    	return "Lado " +lado;
    }
	
}
