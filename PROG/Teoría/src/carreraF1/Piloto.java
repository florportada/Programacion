package carreraF1;

public class Piloto {
	String nombre;
	int experiencia;
	String escuderia;
	int numVictorias;

	public Piloto(String nombre, int experiencia, String escuderia, int numVictorias) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.escuderia = escuderia;
		this.numVictorias = numVictorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public int getNumVictorias() {
		return numVictorias;
	}

	public void setNumVictorias(int numVictorias) {
		this.numVictorias = numVictorias;
	}

}
