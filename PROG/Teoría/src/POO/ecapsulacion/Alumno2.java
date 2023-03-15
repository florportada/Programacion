package POO.ecapsulacion;

public class Alumno2 {
	// Variables de instancia
	private String nombre;
	private String apellidos;
	private double notaMedia;

	public Alumno2(String nombre, String apellidos, double notaMedia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	// Método o función
	public void estudiar() {
		System.out
				.println("El alumno " + nombre + " " + apellidos + " está estudiando y tiene una nota de " + notaMedia);
	}

}
