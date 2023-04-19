package Vehículos;

public class Motos extends VehiculosMotor {
	private int cilindrada;

	public Motos(String patente, String modelo, String marca, int anio) {
		super(patente, modelo, marca, anio);
	}

	public Motos(String patente, String modelo, String marca, int anio, int cilindrada) {
		super(patente, modelo, marca, anio);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto (marchas= " + cilindrada + " getMarca()= " + getMarca() + "getPatente()= " + getPatente()
				+ "getMaodelo()= " + getModelo();
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("La moto " + this.getPatente() + " esta acelerando");

	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("La moto " + this.getPatente() + " esta frenando");

	}

}
