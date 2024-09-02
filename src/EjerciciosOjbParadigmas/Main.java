package EjerciciosOjbParadigmas;

public class Main {

	public static void main(String[] args) {
		
		Cerradura c1 = new Cerradura(1234,4);
		
		c1.abrir(1234);
		c1.abrir(3421);
		c1.abrir(3421);
		c1.abrir(3421);
		System.out.println("Aperturas fallidas "+c1.contarAperturasFallidas());
		
		//c1.abrir(1234);
		System.out.println("Fue bloqueada? "+c1.fueBloqueada());
		
		//si intento abrir estando bloqueada
		
	
		System.out.println("Aperturas exitosas "+c1.contarAperturasExitosas());
		
	}

///En el ejercicio 6 que atributo debería tener cerradura?
}

/*
 * 
 * TESTEO DE CLASE CIRCULO
 Circulo c1 = new Circulo();
		c1.cambiarRadio(3.5);
		System.out.println("Radio "+c1.getRadio());
		System.out.println("Diametro " +c1.getDiametro());
		System.out.println("Perimetro "+c1.getPerimetro());
		System.out.println("Area "+c1.getArea());
		c1.cambiarArea(4.5);
		System.out.println(c1.getArea());
		
		/// Porque no hace cambios???
		System.out.println(c1.getRadio());
 */

//TODO Auto-generated method stub
		/*
		  
		 TESTEO DE CLASE PUNTO
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		p1.obtenerX();
		p1.obtenerY();
		
		System.out.println(p1.obtenerX());
		System.out.println(p1.obtenerY());
		p1.cambiarX(0);
		p1.cambiarY(0);
		System.out.println("Valor nuevo de X "    + p1.obtenerX());
		System.out.println("Valor nuevo de y "    + p1.obtenerY());
		System.out.println("Distancia al origen " + p1.distanciaAlOrigen());
		System.out.println(p1.esElOrigen());
		System.out.println(p1.estaSobreEjeX());
		System.out.println(p1.estaSobreEjeY());
		System.out.println(p1.distanciaAotroPunto(p2));
		*/