package zoo;

public class Vaca extends Animal{
	int cuernos;

	public Vaca(String nombre, String tipo, int cuernos) {
		super(nombre, tipo);
		this.cuernos = cuernos;
	}

	public int getCuernos() {
		return cuernos;
	}

	public void setCuernos(int cuernos) {
		this.cuernos = cuernos;
	}
	
	

}
