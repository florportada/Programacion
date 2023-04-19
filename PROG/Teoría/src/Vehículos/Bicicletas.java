package Vehículos;

public class Bicicletas extends Vehiculos {
	private int marchas;

	public Bicicletas(String modelo, String marca, int anio) {
		super(modelo, marca, anio);
	}

	public Bicicletas(String modelo, String marca, int anio, int marchas) {
		super(modelo, marca, anio);
		this.marchas = marchas;
	}

	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	public static void inflarRuedas() {

	}

	@Override
	public String toString() {
		return "Bicicleta (marchas= " + marchas + " getMarca()= " + getMarca() + ", getModelo()= " + getModelo() + ")";
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("La bici esta acelerando");

	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("La bici esta frenando");

	}

}
