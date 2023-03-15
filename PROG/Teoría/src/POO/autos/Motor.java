package POO.autos;



public class Motor {
	private String marca;
	private int Caballos;
	private Piston pistones;
	//private Auto auto;
	
	public Motor(String marca, int Caballos, Piston pistones) {
		super();
		this.marca = marca;
		this.Caballos = Caballos;
		this.pistones = pistones;
		//this.auto = auto;
	}
	

	public Motor(String marca, int caballos) {
		super();
		this.marca = marca;
		Caballos = caballos;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCaballos() {
		return Caballos;
	}

	public void setCaballos(int Caballos) {
		this.Caballos = Caballos;
	}

	public Piston getPistones() {
		return pistones;
	}

	public void setPistones(Piston pistones) {
		this.pistones = pistones;
	}

}
