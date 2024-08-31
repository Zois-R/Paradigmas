package EjerciciosOjbParadigmas;

import java.util.Objects;

public class Circulo {
	/*
	 * Implementar una clase que modele un círculo, del que se desea manipular
	 * (obtener y cambiar):
	 * 
	 * radio diámetro perímetro área Realizar todas las pruebas que considere
	 * convenientes. Se pueden agregar métodos privados.
	 */
	private double radio;

	/// Donde es bueno asignar los valores de mis atributos?

	/// Si hago un constructor con parametros son necesarios los getters? Parece que
	/// si para asegurar la integridad de los datos

	public Circulo(double r) {
		this.radio = r;

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
//	 Math.PI * Math.pow(nuevoRadio, 2);
		this.radio = Math.sqrt(nuevaArea / Math.PI);
	}

	public void cambiarDiametro(double nuevoDiametro) {
		this.radio = nuevoDiametro * 2;
	}

	public void cambiarPerimetro(double nuevoPerimetro) {
		this.radio = nuevoPerimetro / Math.PI * 2;
	}
}
