package POO.autos;

public class Garaje {

	public static void main(String[] args) {
		// Creo el auto 1
		Piston piston1 = new Piston(1, "Marca1");
		Motor motor1 = new Motor("MarcaMotor1", 120, piston1);
		Volante volante1 = new Volante(1, "Carrera", "Negro");
		
		Auto auto1 = new Auto("SEAT", "111-ABC", motor1, volante1);
		System.out.println("Matrícula: " + auto1.getPatente());
		System.out.println("Color del volante: " + auto1.getVolante().getColor());
		System.out.println("Id del pistón: " + auto1.getMotor().getPistones().getId());
		System.out.println();
		
		double velocidad1 = Math.random()*120;
		auto1.setVelocidad(velocidad1);
		auto1.conducir();
		System.out.println();
		
		// Creo el auto 2
		Piston piston2 = new Piston(2, "Marca2");
		Motor motor2 = new Motor("MarcaMotor2", 180, piston2);
		Volante volante2 = new Volante(2, "Deportivo", "Blanco");
		
		Auto auto2 = new Auto("FIAT", "123-HFG", motor2, volante2);
		System.out.println("Matrícula: " + auto2.getPatente());
		System.out.println("Color del volante: " + auto2.getVolante().getColor());
		System.out.println("Id del pistón: " + auto2.getMotor().getPistones().getId());
		System.out.println();
		
		double velocidad2 = Math.random()*120;
		auto2.setVelocidad(velocidad2);
		auto2.conducir();
	}

}
