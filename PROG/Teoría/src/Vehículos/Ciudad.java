package Vehículos;

public class Ciudad {
	private String nombre;

	public Ciudad(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Ciudad ciudad1 = new Ciudad("Madrid");
		ciudad1.iniciaCiudad();
	}

	private void iniciaCiudad() {
		Vehiculos[] vehiculos = UtilsCiudad.generaVehiculos();

		Garage garage = new Garage("Garage1");
		garage.aparcar(vehiculos);
	}

}
