package POO.ecapsulacion;

public class Alumno {
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private Asignatura [] asignaturas;
	private double notaMedia;
	
	public Alumno(String nombre, String apellidos,  Asignatura[] asignaturas, double notaMedia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = asignaturas;
		this.notaMedia = notaMedia;
		
	}
	

	//Constructor --> crear, no modificar
	public Alumno(String nombre, String apellidos){
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	//Constructor --> crear, no modificar
	public Alumno(String nombre, String apellidos, Asignatura[] asignaturas) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = asignaturas;
	}
	
	//Getter y setter
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public double getNotaMedia() {
		return this.notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	//Método o función
	public void estudiar() {
		System.out.println("El alumno " + nombre + " " + apellidos + " está estudiando y tiene una nota media de " + notaMedia);
	}

}
