package Bucles;

import java.util.Scanner;

public class Fibonacci3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opc;

		while (true) {
			System.out.println("¿Quieres intentar?(Si/No) ");
			opc = scan.next();
			switch (opc.toLowerCase()) {
			case "no":
				System.out.println("Saliendo");
				scan.close();
				System.exit(0);
				break;
			case "si":
				int num1 = 0, num2 = 1, elemento;
				do {
					System.out.print("Elementos a imprimir: ");
					elemento = scan.nextInt();
				} while (elemento <= 1); {

				System.out.print(num1 + "," + num2);
				for (int i = 0; i <= elemento - 3; ++i) {
					int suma = num1 + num2;
					System.out.print("," + suma);
					num1 = num2;
					num2 = suma;
				}
				System.out.println();
			}
				break;
			default:
				System.out.println("Error, solo Si o No");
				break;
			}

		}
	}
}
