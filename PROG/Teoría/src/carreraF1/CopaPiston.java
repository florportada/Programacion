package carreraF1;

public class CopaPiston {

	public static void main(String[] args) {
		Circuito circuito = new Circuito("GP de Monaco", "Monaco");

		Piloto p3 = new Piloto("Fernando Alonso", 21, "Aston Martin", 32);
		Piloto p2 = new Piloto("Charles Leclerc", 6, "Ferrari", 5);
		Piloto p1 = new Piloto("Lando Norris", 7, "McLaren", 0);

		F1 f3 = new F1("Aston Martin", "Mercedes", 4, p3, 180.4, 35);
		F1 f2 = new F1("Ferrari", "Ferrari", 16, p2, 189.5, 40);
		F1 f1 = new F1("McLaren", "Mercedes", 14, p1, 178.4, 30);

		F1[] parrilla = { f1, f2, f3 };

		Carrera carrera = new Carrera(circuito, parrilla, 260.286);
		carrera.iniciarCarrera();
	}

}
