package Arrays;

public class ArrayDatosConocidos {

	public static void main(String[] args) {
		
		String [] colores = {"Rojo", "Azul","Amarillo"}; // no se puede modificar el array, hay que crear otro array con diferente longitud
		String [][] alumnosAula = {{"a1","A2","A3"},{"B1","B2","B3"}};
		System.out.println(colores.length); // .length no es un método
		System.out.println(colores[2]);
		System.out.println("********************************");
		
		// Recorremos array con for tradicional 
		for (int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
			
		}
		System.out.println("******************************");
		// Recorremos array con foreach
		for(String color:colores) {
			System.out.println(color);
			
		}
	}

}
