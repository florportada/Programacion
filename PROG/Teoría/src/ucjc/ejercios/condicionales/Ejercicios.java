package ucjc.ejercios.condicionales;

public class Ejercicios {

	public static void main(String[] args) {
		String mes = "Agosto";
		
		if (mes == "Enero" || mes == "Febrero" || mes == "Marzo") {
			System.out.println("Invierno");
		}else if (mes == "Abril" || mes == "Mayo" || mes == "Junio") {
			System.out.println("Primavera");
		}else if (mes == "Julio" || mes == "Agosto" || mes == "Septiembre") {
			System.out.println("Verano");
		}else if (mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre") {
			System.out.println("Otoño");
		}else {
			System.out.println("No existe");
		}
		
		switch(mes){
		case "Enero":
		case "Febrero":
		case "Marzo": 
			System.out.println("Invierno"); 
			break;
		case "Abril": 
		case "Mayo": 
		case "Junio": 
			System.out.println("Primavera"); 
			break;
		case "Julio": 
		case "Agosto": 
		case "Septiembre": 
			System.out.println("Verano"); 
			break;
		case "Octubre": 
		case "Noviembre": 
		case "Diciembre": 
			System.out.println("Otoño"); 
			break;
		default: System.out.println("No existe"); break;
		}
		

	}

}
