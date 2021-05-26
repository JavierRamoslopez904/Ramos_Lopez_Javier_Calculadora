package funcionalidad;

/**
 * Clase que determina las operaciones de la calculadora
 * 
 * @author javie
 *
 */
public class Operations {

	/** Método estático que recibirá dos números por parámetro y devolverá la suma */
	public static double sumaNumeros(double firstNumber, double secondNumber) {

		return firstNumber + secondNumber;

	}

	/** Método estático que recibirá dos números por parámetro y devolverá la resta */
	public static double restaNumeros(double firstNumber, double secondNumber) {

		return firstNumber - secondNumber;

	}

	/** Método estático que recibirá dos números por parámetro y devolverá la multiplicar */
	public static double multiplicarNumeros(double firstNumber, double secondNumber) {

		return firstNumber * secondNumber;

	}

	/** Método estático que recibirá dos números por parámetro y devolverá la dividir */
	public static double dividirNumeros(double firstNumber, double secondNumber) {

		return firstNumber / secondNumber;

	}

}
