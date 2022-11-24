package javaapplication3;

import java.util.Scanner;

/*
 * Mediante puntos de interrupcion e inspecci�n de variables encuentra
 * donde esta el fallo del programa. 
 * 
 * Ademas de indicar el error debes subir un par de capturas de pantalla 
 * en las que se vea que estas empleando el debugger para inspeccionar las variables
 * 
 */
public class Debugging2 {
	public static void main(String[] args) {

		double a, b, media;
		Scanner cin = new Scanner(System.in);
		media = 0;
		
		System.out.print("Introduce 1 valor: ");
		a = cin.nextDouble();
		System.out.print("Introduce otro valor: ");
		b = cin.nextDouble();
		media = (a + b) /2;
		System.out.println("La media es: " + media);
	}
}
