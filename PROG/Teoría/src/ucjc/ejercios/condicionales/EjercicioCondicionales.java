package ucjc.ejercios.condicionales;

import java.util.Scanner;

/* Declarar variable tipo string para representar el nombre de un mes 
 * a partir del mes indicar la estación del año
 */
public class EjercicioCondicionales {

	public static void main(String[] args) {
		String mes = "Enero";
		Scanner scan = new Scanner(System.in); 
		System.out.println("Escribe el nombre de un mes: ");
		mes = scan.nextLine();
		//System.out.println("Mes introducido: "+ mes);
		
		//Con el if
		String estacion = "";
		String mesFebrero = "Febrero";
		if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase(mesFebrero) || mes.equalsIgnoreCase("Marzo")) {
			estacion = "invierno";
				System.out.println("La estación del "+mes+" es "+estacion);
		}else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
			estacion = "primavera";
				System.out.println("La estación del "+mes+" es "+estacion);
		}else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Septiembre")) {
			estacion = "verano";
				System.out.println("La estación del "+mes+" es "+estacion);
		}else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre")) {
			estacion = "otoño";
				System.out.println("La estación del "+mes+" es "+estacion);
		}else {
			System.out.println("Error");
		}
		
		//Switch
		switch(mes.toLowerCase()){
			case "enero":
			case "febrero":
			case "marzo": System.out.println("La estación del mes es invierno"); break;
			case "abril": 
			case "mayo": 
			case "junio": System.out.println("La estación del mes es primavera"); break;
			case "julio": 
			case "agosto": 
			case "septiembre": System.out.println("La estación del mes es verano"); break;
			case "octubre": 
			case "noviembre": 
			case "diciembre": System.out.println("La estación del mes es otoño"); break;
			default: System.out.println("No existe"); break;
		}
	}

}
