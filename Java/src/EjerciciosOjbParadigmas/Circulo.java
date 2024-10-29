package EjerciciosOjbParadigmas;

import java.util.Objects;

public class Circulo {
	
	private Punto centro;
	private double radio;


	public Circulo(double r) {
		this.radio = r;

	}

	public Circulo(Punto centro, double radio) 
	{
		this.centro = centro;
		if(radio <= 0)
			throw new IllegalArgumentException("El radio tiene que ser mayor a cero");
		this.radio = radio;
	}
	
	public boolean intersectaCon(Circulo c2) {
       
        double distanciaCentros = this.centro.distanciaAotroPunto(c2.centro);

        
        return distanciaCentros <= (this.radio + c2.radio) && distanciaCentros >= Math.abs(this.radio - c2.radio);
    }
	
	
	
	public void setRadio(double nuevoRadio) {
		if (nuevoRadio > 0)
			this.radio = nuevoRadio;
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

	public double getDiametro() {
		return radio * 2;
	}

	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}

	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public void cambiarRadio(double nuevoRadio) {
		this.radio = nuevoRadio;
	}

	public void cambiarArea(double nuevaArea) {
		this.radio = Math.sqrt(nuevaArea / Math.PI);
	}

	public void cambiarDiametro(double nuevoDiametro) {
		this.radio = nuevoDiametro * 2;
	}

	public void cambiarPerimetro(double nuevoPerimetro) {
		this.radio = nuevoPerimetro / Math.PI * 2;
	}
}
