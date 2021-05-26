package funcionalidad;

/**
 * Clase que determina las operaciones de la calculadora
 * 
 * @author javie
 *
 */
public class Operations {

	/** M�todo est�tico que recibir� dos n�meros por par�metro y devolver� la suma */
	public static double sumaNumeros(double firstNumber, double secondNumber) {

		return firstNumber + secondNumber;

	}

	/** M�todo est�tico que recibir� dos n�meros por par�metro y devolver� la resta */
	public static double restaNumeros(double firstNumber, double secondNumber) {

		return firstNumber - secondNumber;

	}

	/** M�todo est�tico que recibir� dos n�meros por par�metro y devolver� la multiplicar */
	public static double multiplicarNumeros(double firstNumber, double secondNumber) {

		return firstNumber * secondNumber;

	}

	/** M�todo est�tico que recibir� dos n�meros por par�metro y devolver� la dividir */
	public static double dividirNumeros(double firstNumber, double secondNumber) {

		return firstNumber / secondNumber;

	}

}
