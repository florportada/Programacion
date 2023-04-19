package Vehículos;

public abstract class VehiculosMotor extends Vehiculos {
	private String patente;

	public VehiculosMotor(String patente, String modelo, String marca, int anio) {
		super(modelo, marca, anio);
		this.patente = patente;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void arrancar() {
		System.out.println("El vehículo con " + this.patente + " está arrancando");
	}

	public void parar() {
		System.out.println("El vehículo con " + this.patente + " está parando");
	}

}
