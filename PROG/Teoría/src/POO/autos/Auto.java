package POO.autos;


public class Auto {
	private String marca;
	private String patente;
	private Motor motor;
	private Volante volante;
	private double velocidad;
	
	
	
	public Auto(String marca, String patente, Motor motor, Volante volante, double velocidad) {
		super();
		this.marca = marca;
		this.patente = patente;
		this.motor = motor;
		this.volante = volante;
		this.velocidad = velocidad;
	}

	public Auto(String marca, String patente, Motor motor, Volante volante) {
		super();
		this.marca = marca;
		this.patente = patente;
		this.motor = motor;
		this.volante = volante;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Volante getVolante() {
		return volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}
	
	
	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	
	public void conducir() {
		System.out.println("El coche con matricula " + patente + " va a " + velocidad + "km por hora");
	}


}
