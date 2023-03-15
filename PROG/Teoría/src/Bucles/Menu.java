package Bucles;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// boolean salir = false;
		int opc;
		do {
			System.out.println("1. Validar email");
			System.out.println("2. Pintar cuadrado");
			System.out.println("3. Mostrar datos");
			System.out.println("4. Salir");
			System.out.println();

			System.out.print("Introduce la opción: ");
			opc = scan.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Has seleccionado validar email");
				System.out.println();
				System.out.print("Email: ");
				String email = scan.next();
				int numAr = 0; // contar los @
				char temp;
				for (int i = 0; i < email.length(); i++) {
					temp = email.charAt(i);
					if (temp == '@')
						numAr++;
				}
				if (numAr != 1) { // si hay más o no hay @, imprime que no es válido
					System.out.println("El email no es válido porque tiene " + numAr + " @");
					System.out.println();
				} else {
					if (email.contains(" ")) { // si hay espacios, imprime que no es válido
						System.out.println("El email no es válido, porque tiene espacios");
						System.out.println();
					} else {
						int posAr = email.indexOf("@");
						String email1 = email.substring(posAr + 1);
						int numPto = 0;// contar los . después del @
						char temp2;
						for (int k = 0; k < email1.length(); k++) {
							temp2 = email1.charAt(k);
							if (temp2 == '.')
								numPto++;
						}
						if (numPto == 0) { // si no hay . , imprime que no es válido
							System.out.println("El email no es válido, porque no tiene por lo menos 1 punto");
							System.out.println();
						} else {
							String [] puntos = email1.split("\\."); // separar valores
//							System.out.println(puntos[puntos.length-1].length());
							if (puntos[puntos.length-1].length() < 2) { //si la última palabra es menor a 2 el email no es válido
								System.out.println("El email no es válido, porque después del último punto la palaba es menor a 2");
								System.out.println();
							} else if (puntos[puntos.length-1].length() > 6) { //si la última palabra es mayor a 6 el email no es válido
								System.out.println("El email no es válido, porque después del último punto la palaba es mayor a 6");
								System.out.println();
							} else { // si cumple con todas las condiciones anteriores es valido e imprime el email
								System.out.println("El email es válido");
								System.out.println("El email es: " + email);
								System.out.println();
							}
						}
					}
				}
				break;

			case 2:
				System.out.println("Has seleccionado pintar cuadrado");
				System.out.print("Tamaño del cuadrado: ");
				int tamaño = scan.nextInt();
				pintarCuadrado(tamaño);
				System.out.println();
//				System.out.print("Tamaño del cuadrado: ");
//				int tamaño = scan.nextInt();
//				for(int h = 0; h < tamaño; h++) { //fila
//					for(int v = 0; v < tamaño; v++) { //columna
//						if (h == 0 || h == tamaño - 1) {//tamaño del cuadrado
//							System.out.print("*");
//							if (v == tamaño - 1) {
//								System.out.println();
//							} else {
//								System.out.print("");
//							}
//						} else if (v == 0 || v == tamaño - 1) {
//							System.out.print("*");
//							if (v == tamaño - 1) {
//								System.out.println();
//							} else {
//								System.out.print("");
//							}
//						} else {
//							System.out.print(" ");
//						}
//					}
//				}
//				System.out.println("");
				break;

			case 3:
				System.out.println("Has seleccionado mostrar datos");
				System.out.println("");
				System.out.print("Introduce el nombre: ");
				String nombre = scan.next();

				System.out.print("Introduce el apellido/s: ");
				String apellido = scan.next();

				System.out.print("Introduce la altura: ");
				String altura = scan.next();

				System.out.print("Introduce el peso: ");
				String peso = scan.next();

				System.out.println("Nombre: " + nombre);
				System.out.println("Apellido/s: " + apellido);
				System.out.println("Altura: " + altura + "cm");
				System.out.println("Peso: " + peso + "kg");
				System.out.println();

				break;
			case 4:
				System.out.println("Has seleccionado salir");
				scan.close();
				// salir = true;
				break;
			default:
				System.out.println("Error, solo números entre 1 y 4");
				System.out.println();
			}

		} while (opc != 4);
	}

	public static void pintarCuadrado(int size) { // Función de java
		for (int i = 0; i < size; i++) {// filas
			for (int j = 0; j < size; j++) {// columnas
				if (i == 0 || i == size - 1) {
					System.out.print("*\t");
				} else {
					if (j == 0 || j == size - 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				}
			}
			System.out.println();
		}

	}
}
