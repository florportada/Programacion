package Vehículos;

public abstract class Vehiculos {
	private String modelo;
	private String marca;
	private int anio;

	public Vehiculos(String modelo, String marca, int anio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.anio = anio;
	}

	public Vehiculos(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	public Vehiculos(String marca, int anio) {
		super();
		this.marca = marca;
		this.anio = anio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String toSting() {
		return "Vehículo (marca=" + marca + ", modelo=" + modelo + " añoFabricacion =" + anio;
	}

	public abstract void acelerar();

	public abstract void frenar();

//	public static void acelerar() {
//		System.out.println("El vehículo con matricula " + this.patente + " de esta acelerando");
//
//	}

//	public static void frenar() {
//		System.out.println("El vehículo con matricula " + this.patente + " de esta frenando");
//
//	}

}
