package Vehículos;

public final class CocheElectrico extends Coches {

	private double velocidadCarga;

	public CocheElectrico(String patente, String modelo, String marca, int anio, int puertas, String combustible,
			double velocidadCarga) {
		super(patente, modelo, marca, anio, puertas, combustible);
		this.velocidadCarga = velocidadCarga;
	}

	public double getVelocidadCarga() {
		return velocidadCarga;
	}

	public void setVelocidad(double velocidadCarga) {
		this.velocidadCarga = velocidadCarga;
	}

	public static void recargar() {
		System.out.println("El coche eléctrico está recargando");

	}

}
