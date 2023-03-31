package zoo;

public class Elefante extends Animal{
	double trompa;
	
	public Elefante(String nombre, String tipo, double trompa) {
		super(nombre, tipo);	
	}
	
	public double getTrompa() {
		return trompa;
	}

	public void setTrompa(double trompa) {
		this.trompa = trompa;
	}

	public void desplazar () { //--> Amplio funcionalidad y añado despacio
		
	}
    public void programarJava() {
    	
    }

}
