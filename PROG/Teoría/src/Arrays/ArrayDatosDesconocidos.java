package Arrays;

import java.util.Scanner;

public class ArrayDatosDesconocidos { // o matrices o arreglos

	public static void main(String[] args) {
		
		int [][] numeros = new int [2][3];
		numeros[1][1] = 8;
		System.out.println("Posición 1.1: " + numeros[1][1]);
		System.out.println("filas: " + numeros.length); //length da el numero de filas
		System.out.println("columnas: " + numeros[1].length); //length da el numero de columnas
		
		// Mostramos los datos
		for (int fila = 0; fila < numeros.length; fila++) {//filas
			for (int col = 0; col < numeros[fila].length; col++) {//columnas
				System.out.print(numeros[fila][col]);
					}
			System.out.println();
		}
		// Asignamos datos a la matriz
		for (int fila = 0; fila < numeros.length; fila++) {//filas
			for (int col = 0; col < numeros[fila].length; col++) {//columnas
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce el valor de la posición [" + fila + "], [" + col + "]");
				numeros[fila][col] = scan.nextInt();
					}
			System.out.println();
		}
	}

}
