package Bucles;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		boolean si = false;
//			
//				Scanner scan1 = new Scanner(System.in);
//				int num1 = 1, num2 = 1, suma, serie;
//				do {System.out.println("Elemento a imprimir: ");
//					suma = scan1.nextInt();
//				}while(suma <= 1);
//		
//				System.out.println("La serie de Fibonacci de " + suma + " digitos es: ");
//				num1 = 0;
//				num2 = 1;
//				System.out.print(num1 + ",");
//				for(serie = 2; serie <= suma; ++serie) {
//					System.out.print(num2 + ",");
//					num2 = num1 + num2;
//					num1 = num2 - num1;
//				}
//				System.out.println();
		Scanner scan = new Scanner(System.in);
		String opc;
		while (!si) {
			System.out.println("¿Quieres intentar?(Si/No) ");
			opc = scan.nextLine();
			switch (opc.toLowerCase()) {
			case "Si":
			case "si":
				int num1 = 1, num2 = 1, elemento, serie;
				do {
					System.out.println("Elemento a imprimir: ");
					elemento = scan.nextInt();
				} while (elemento <= 1); {

				System.out.println("La serie de Fibonacci de " + elemento + " digitos es: ");
				num1 = 0;
				num2 = 1;
				System.out.print(num1 + ",");
				for (serie = 0; serie <= elemento - 2; ++serie) {
					System.out.print(num2 + ",");
					num2 = num1 + num2;
					num1 = num2 - num1;
				}
				System.out.println();
			}
				break;

			case "No":
			case "no":
				System.out.println("Saliendo");
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("Error, solo Si o No");

			}

		}
	}
}