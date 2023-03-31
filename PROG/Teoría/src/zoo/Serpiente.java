package zoo;

public class Serpiente extends Animal{
	double longitud;

	public Serpiente(String nombre, String tipo, double longitud) {
		super(nombre, tipo);
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public void desplazar() { // --> sobrescribe y se desplaza reptando

	}
}
