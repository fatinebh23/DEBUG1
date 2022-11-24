/*
 * Mediante puntos de interrupcion e inspección de variables encuentra
 * donde esta el fallo del programa. 
 * 
 * Ademas de indicar el error debes subir un par de capturas de pantalla 
 * en las que se vea que estas empleando el debugger para inspeccionar las variables
 * 
 */
public class Debugging4 {
	public static int main(String[] args) {

		Scanner sc;

		System.out.println("Introduce un mes(en numero) (Ej: 1 para Enero, etc)");
		sc = new Scanner(System.in);
		float month = Integer.parseInt(sc.next());

		if (month / 2 == 0) {
			System.out.println("El mes es Par");
		} else {
			System.out.println("El mes es Impar");
		}

		switch (month) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Mes no válido.");
			break;
		}

		// bucle para calcular meses que faltan hasta el nuevo año
		int j = 0;
		int i = month;
		while (i != 0) {
			i += 1;
			j++;
			System.out.println("Calculando meses hasta el año nuevo...");
		}

		System.out.println("Queda un total de: " + j+" meses para el año nuevo.");
	}

}
