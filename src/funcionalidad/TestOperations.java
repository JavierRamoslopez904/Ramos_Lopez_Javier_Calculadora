package funcionalidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOperations {

	@Test
	/** M�todo p�blico encargado de testear el m�todo de sumar*/
	public void testearSumaNumeros() {
		
		// Variable result que almacenar� el resultado del m�todo
		double result = Operations.sumaNumeros(1,2);
		
		// Variable soluci�n que almacenar� en una variable la variable esperada
		double solucion = 3;
		
		assertEquals(solucion,result);
		
	}
	
	@Test
	/** M�todo p�blico encargado de testear el m�todo de restar*/
	public void testearRestaNumeros() {
		
		// Variable result que almacenar� el resultado del m�todo
		double result = Operations.restaNumeros(2,2);
		
		// Variable soluci�n que almacenar� en una variable la variable esperada
		double solucion = 0;
		
		assertEquals(solucion,result);
		
	}
	
	@Test
	/** M�todo p�blico encargado de testear el m�todo de multiplicar*/
	public void testearMultiplicacionNumeros() {
		
		// Variable result que almacenar� el resultado del m�todo
		double result = Operations.multiplicarNumeros(3,3);
		
		// Variable soluci�n que almacenar� en una variable la variable esperada
		double solucion = 9;
		
		assertEquals(solucion,result);
		
	}
	
	@Test
	/** M�todo p�blico encargado de testear el m�todo de dividir*/
	public void testearDividirNumeros() {
		
		// Variable result que almacenar� el resultado del m�todo
		double result = Operations.dividirNumeros(4, 2);
		
		// Variable soluci�n que almacenar� en una variable la variable esperada
		double solucion = 2;
		
		assertEquals(solucion,result);
		
	}
	
	
	

}
