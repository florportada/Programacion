package POO.ecapsulacion;

public class Asignatura {
//nombre y nota
	private String asignatura;
	private double nota;
	
	public Asignatura(String asignatura, double nota) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
	}
	public Asignatura(String asignatura) {
		super();
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void study() {
		System.out.println("En " + asignatura + " tiene " + nota);
	}
}

	