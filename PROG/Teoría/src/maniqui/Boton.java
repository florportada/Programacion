package maniqui;

public class Boton {
	private String color;
	private String forma;
	private String tamano;
	
	public Boton(String color, String forma, String tamano) {
		super();
		this.color = color;
		this.forma = forma;
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	
	
}
