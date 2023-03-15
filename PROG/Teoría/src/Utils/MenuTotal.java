package Utils;

import java.util.Scanner;

public class MenuTotal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opc = 0;
		do {
//			String menu_t = "1. Validar email\n2. Pintar cuadrado\n3. Mostrar datos\n4. Salir\n";
//			String menu_s = "1. Validar email|2. Pintar cuadrado|3. Mostrar datos|4. Salir\n";
//			Utilidades.pintarMenu(menu_t);
//			Utilidades.pintarMenu(menu_s, "\\|");
			Utilidades.pintarMenu();

			opc = Integer.parseInt(Utilidades.pideDatos("Elige una opción: ")); // parseInt pasamos lo forzamos a ser
																				// integral

			switch (opc) {
			case 1:
				Utilidades.validarEmail();
				break;

			case 2:
				System.out.println("Has seleccionado pintar cuadrado");
				System.out.println();
				System.out.print("Tamaño del cuadrado: ");
				int tamaño = scan.nextInt();
				Utilidades.pintarCuadrado(tamaño);
				System.out.println();
				break;

			case 3:
				Utilidades.mostrarDatos();

				break;
			case 4:
				System.out.println("Has seleccionado salir");
				scan.close();

				break;
			default:
				System.out.println("Error, solo números entre 1 y 4");
				System.out.println();
			}

		} while (opc != 4);
	}

}
