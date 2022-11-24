package javaapplication3;


/*
 * Mediante puntos de interrupcion, inspecci�n y modificaci�n de variables durante la ejecuci�n 
 * y uso de puntos de interrupci�n condicional debes lograr que se ejecute el bucle for. Fijate en 
 * las indicaciones de los comentarios. 
 * 
 * Debes subir un par de capturas de pantalla en las que se vea que estas empleando el debugger 
 * y una captura de pantalla donde se vea el resultado de la ejecuci�n del programa por consola
 * 
 */
public class Debugging3 {

	public static void main(String[] args) {

		int aleatorio = devuelveNumeroAleatorio(1000);
		int sum = 0;

		//Cambiar mediante el explorador de variables del debugger el valor..
		//...de la varible aleatorio para que sea igual a 33
		if (aleatorio == 33) {
			
			//Antes de entrar en el bucle for cambiar la variable aleatorio a su valor original
			for (int i = 0; i < aleatorio; i++) {
				sum = sumame(sum, i);				
			}
			System.out.println("resultado de las sumas = " + sum);
			System.out.println("El valor de la variable aleatorio es " + aleatorio);
		}
	}
	
	//Devuelve un numero aleatorio entre 1 y num
	public static int devuelveNumeroAleatorio(int num) {
		return (int) Math.floor(Math.random() * num + 1);
	}
	
	public static int sumame(int a, int b) {
		a = a + b;
		return a;
	}
	

}
