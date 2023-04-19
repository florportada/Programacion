package Vehículos;

public final class SideCar extends Motos {
	private double tamanio;

	public SideCar(String patente, String modelo, String marca, int anio) {
		super(patente, modelo, marca, anio);
	}

	public SideCar(String patente, String modelo, String marca, int anio, double tamanio) {
		super(patente, modelo, marca, anio);
		this.tamanio = tamanio;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public static void desmontar() {
		System.out.println("Desmontando el sidecar");

	}

}
