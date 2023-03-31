package herencia;

public class ClaseHija1 extends ClasePadre{
	
	private int valor3 = 7;


	public ClaseHija1(String valor1, String valor2, int valor3) {
		super(valor1, valor2);
		this.valor3 = valor3;
	}
	public int getValor3() {
		return valor3;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}
//	Sobreescribir metodo1 del padre
	public void Metodo1() {
		System.out.println("Metodo 1 de la clase hija");
	}
	
	@Override
	public String toString() {
		return "ClaseHija1 [valor3=" + valor3 + ", getValor3()=" + getValor3() + ", getValor1()=" + getValor1()
				+ ", getValor2()=" + getValor2() + "]";
	}
	
}
