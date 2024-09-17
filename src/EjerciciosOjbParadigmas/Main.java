package EjerciciosOjbParadigmas;

public class Main {

	public static void main(String[] args) {
		
		 Rango[] rangos = new Rango[3];
		 rangos[0] = Rango.rangoCerrado(1.0, 5.0, false, false);
	     rangos[1] = Rango.rangoAbierto(2.0, 6.0, true, true);
	     rangos[2] = Rango.rangoCerrIzqAbDer(0.0, 4.0, false, true);
	     //System.out.println(Rango.abarcador(rangos));  
	     System.out.println(Rango.sumarRangos(rangos[0], rangos[1]));
	     System.out.println(rangos[0].desplazarRango(5, rangos[0]));
	}


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