package POO.autos.opc2;


public class Main {

	public static void main(String[] args) {
		
		Volante volante1 = new Volante(null, null, null);
		Piston piston1 = new Piston(null, null);
		Motor motor1 = new Motor(null, 0, piston1);
		Auto auto1 = new Auto(null, null, motor1, volante1, 0);
		auto1.Aut();
		System.out.println();
		System.out.println("Marca del coche: " + auto1.getMarca());
		System.out.println("Martícula: " + auto1.getPatente());
		System.out.println("Marca del motor: " + auto1.getMotor().getMarca());
		System.out.println("Caballos: " + auto1.getMotor().getCaballos());
		System.out.println("ID de los pistones: " + auto1.getMotor().getPistones().getId());
		System.out.println("Marca de los pistones: " + auto1.getMotor().getPistones().getMarca());
		System.out.println("ID del volante: " + auto1.getVolante().getId());
		System.out.println("Tipo del volante: " + auto1.getVolante().getTipo());
		System.out.println("Color del volante: " + auto1.getVolante().getColor());
		System.out.println("Velocidad del coche: " + auto1.getVelocidad() + "km/h");
	}

}
