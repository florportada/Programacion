package strings;

public class PruebaStrings {

	public static void main(String[] args) {
//		String nombre = "Caperucita Roja";
//		nombre = nombre.toUpperCase();
//		System.out.println(nombre);
//		
//		String lobo1 = "Lobo";
//		String lobo2 = "Lobo";
//		System.out.println(lobo1 == lobo2);
//		System.out.println(lobo1.equals(lobo2));
//		
//		lobo2 = nombre.toLowerCase();
//		
//		System.out.println(lobo1);
//		System.out.println(lobo2);
//		
//		System.out.println(nombre.endsWith("ja"));
//		System.out.println(nombre.indexOf("A")); // donde se encuentra la posicion de la letra
//		System.out.println("     asd     asdasdasd".replace(" ", ""));
//		//
//		System.out.println(nombre.substring(3)); // imprme a partir de la posicion
//		System.out.println(nombre.substring(3,7)); //imprimir posicion desde hasta tal posicion
//		
//		int posicion = nombre.indexOf(" ");
//		int roja = nombre.indexOf("ROJA");
//		System.out.println("INDEX: " + nombre.substring(posicion).trim());
//		System.out.println("ROJA: " + nombre.substring(roja));
//		
		String cadena = "N1.A1.DNI1.23.MADRID";
		String [] valores = cadena.split("\\."); //separar valores
		for (String valor : valores) {
			System.out.println(valor);
		}
		String puntos = "hola.que.hay";
		int pto = puntos.indexOf(".");
		System.out.println(pto); // 4
		String pto1 = puntos.substring(pto+1);
		int pt1 = pto1.indexOf(".");
		System.out.println(pt1); // 3
		System.out.println(pto1); // que.hay
		String pto2 = pto1.substring(pt1+1);
		System.out.println(pto2); //hay
		if (pto2.length() < 2 ) {
			
		}
		

	}

}
