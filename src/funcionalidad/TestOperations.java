package funcionalidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOperations {

	@Test
	/** Método público encargado de testear el método de sumar*/
	public void testearSumaNumeros() {
		
		// Variable result que almacenará el resultado del método
		double result = Operations.sumaNumeros(1,2);
		
		// Variable solución que almacenará en una variable la variable esperada
		double solucion = 3;
		
		assertEquals(solucion,result);
		
	}
	
	@Test
	/** Método público encargado de testear el método de restar*/
	public void testearRestaNumeros() {
		
		// Variable result que almacenará el resultado del método
		double result = Operations.restaNumeros(2,2);
		
		// Variable solución que almacenará en una variable la variable esperada
		double solucion = 0;
		
		assertEquals(solucion,result);
		
	}
	
	@Test
	/** Método público encargado de testear el método de multiplicar*/
	public void testearMultiplicacionNumeros() {
		
		// Variable result que almacenará el resultado del método
		double result = Operations.multiplicarNumeros(3,3);
		
		// Variable solución que almacenará en una variable la variable esperada
		double solucion = 9;
		
		assertEquals(solucion,result);
		
	}
	
	@Test
	/** Método público encargado de testear el método de dividir*/
	public void testearDividirNumeros() {
		
		// Variable result que almacenará el resultado del método
		double result = Operations.dividirNumeros(4, 2);
		
		// Variable solución que almacenará en una variable la variable esperada
		double solucion = 2;
		
		assertEquals(solucion,result);
		
	}
	
	
	

}
