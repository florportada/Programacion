package POO.autos.opc2;

import java.util.Scanner;

public class Volante {
	private String id;
	private String tipo;
	private String color;
	
	public Volante(String id, String tipo, String color) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.color = color;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void Vol(){
		Scanner scan = new Scanner(System.in);
		System.out.print("ID del volante: ");
		id = scan.nextLine();
		System.out.print("Tipo de volante: ");
		tipo = scan.nextLine();
		System.out.print("Color de volante: ");
		color = scan.nextLine();
	}

}
