package maniqui;

public class Camisa extends Ropa{
	private Boton[] botones;
	

	public Camisa(String talla, double precio, String color, Boton[] botones) {
		super(talla, precio, color);
		this.botones = botones;
	}
	
	public Camisa(String talla, double precio, String color) {
		super(talla, precio, color);
	}

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}
	
	
}
