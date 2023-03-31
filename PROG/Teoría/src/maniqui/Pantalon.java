package maniqui;

public class Pantalon extends Ropa{
	private Boton boton;
	

	public Pantalon(String talla, double precio, String color, Boton boton) {
		super(talla, precio, color);
		this.boton = boton;
	}

	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	
	
}
