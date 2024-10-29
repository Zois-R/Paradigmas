package EjerciciosOjbParadigmas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	void areaUnitaria() {
		//Arrange
		Circulo c = new Circulo(1);
		//Act
		double areaObtenida = c.getArea();
		
		//Assert
		//en 1 * 1 * Math.PI pongo el resultado que realmente va
		assertEquals(3.14159,areaObtenida,0.00001); // es un margen de erro que puede ser negativo
	}

}
