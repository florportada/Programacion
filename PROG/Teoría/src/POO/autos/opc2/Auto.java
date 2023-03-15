package POO.autos.opc2;

import java.util.Scanner;

public class Auto {
	private String marca;
	private String patente;
	private Motor motor;
	private Volante volante;
	private int velocidad;
	
	
	
	public Auto(String marca, String patente, Motor motor, Volante volante, int velocidad) {
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
	
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void Aut(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Marca de auto: ");
		marca = scan.nextLine();
		System.out.print("Matrícula: ");
		patente = scan.nextLine();
		motor.Mot();
		volante.Vol();
		System.out.print("Velocidad: ");
		velocidad = scan.nextInt();

	}


}
