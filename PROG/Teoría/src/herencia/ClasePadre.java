package herencia;

public class ClasePadre {
	private String valor1;
	private String valor2;
	
	public ClasePadre() {
		
	}

	public ClasePadre(String valor1, String valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public String getValor1() {
		return valor1;
	}

	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}

	public String getValor2() {
		return valor2;
	}

	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}
//	Sobreescribir metodo
	public void Metodo1() {
		System.out.println("Metodo 1 de la clase padre");
	}
	
}
