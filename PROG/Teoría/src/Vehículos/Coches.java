package Vehículos;

public class Coches extends VehiculosMotor {
	private int puertas;
	private String combustible;

	public Coches(String patente, String modelo, String marca, int anio, int puertas, String combustible) {
		super(patente, modelo, marca, anio);
		this.puertas = puertas;
		this.combustible = combustible;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	
	@Override
	public String toSting() {
		return "Coche [numPuertas=" + puertas + ", tipoCombustible=" + combustible + ", getNumPuertas()="
				+ getPuertas() + ", getTipoCombustible()=" + getCombustible() + "]";
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("El coche "+ this.getPatente() + " esta acelerando");
		
	}


	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("El coche "+this.getPatente() + " esta frenando");
		
	}

}
