package carreraF1;

public class Carrera {
	Circuito circuito;
	F1[] parrillaSalida;
	double distancia;

	public Carrera(Circuito circuito, F1[] parrillaSalida, double distancia) {
		super();

		this.circuito = circuito;
		this.parrillaSalida = parrillaSalida;
		this.distancia = distancia;
	}

	public Circuito getCircuito() {
		return circuito;
	}

	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}

	public F1[] getParrillaSalida() {
		return parrillaSalida;
	}

	public void setParrillaSalida(F1[] parrillaSalida) {
		this.parrillaSalida = parrillaSalida;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public void iniciarCarrera() {
		boolean ganador = false;
		while (ganador == false) {
			for (F1 i : parrillaSalida) {
				i.correr();
				if (i.avance >= distancia) {
					System.out.println("El ganador es " + i.piloto.nombre);
					ganador = true;
					break;
				}
			}
		}
	}
}
