/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class Fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int DivPorTres, DivPorCinco;
		
		for (int i= 1; i < 101; i++)
		{
			DivPorTres = i % 3;		// Obtenemos el valor de la operación de i mod 3, para realizar la comparación
			DivPorCinco = i % 5;	// Obtenemos el valor de la operación de i mod 5, para realizar la comparación
			
			if (DivPorTres == 0 && DivPorCinco == 0)	//Comparamos si la división entre 3 y 5 son iguales a cero
			{
				System.out.println("FizzBuzz");
			}
			else if (DivPorTres == 0)					//Comparamos si la división entre 3 es igual a cero
			{
				System.out.println("Fizz");
			}
			else if (DivPorCinco == 0)					//Comparamos si la división entre 3 es igual a cero
			{
				System.out.println("Buzz");
			}
			else 										// Si no entra en ninguno de los casos anteriores, imprime el valor de i
			{
				System.out.println(i);
			}
			
		}
			
	}

}
