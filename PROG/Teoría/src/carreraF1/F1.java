package carreraF1;

import java.util.Random;

public class F1 {
	String escuderia;
	String motor;
	int numero;
	Piloto piloto;
	double velocidad;
	int avance;

	public F1(String escuderia, String motor, int numero, Piloto piloto, double velocidad, int avance) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
		this.avance = avance;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getAvance() {
		return avance;
	}

	public void setAvance(int avance) {
		this.avance = avance;
	}

	public void correr() {
		avance += (int) (velocidad + piloto.experiencia + new Random().nextInt(11));
		System.out.println(piloto.getNombre() + " avanza " + avance + " kilometros");
	}
}
