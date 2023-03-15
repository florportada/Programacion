package POO.ecapsulacion;

public class Aula {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Alumno1","Apellido1", null, 8.5);
		alumno1.setNombre("Angel");
		alumno1.setApellidos("García");
		alumno1.setNotaMedia(9.7);
		//System.out.println(alumno1.getNombre());
		alumno1.estudiar();
		
		Alumno alumno2 = new Alumno("Martín","Amapola");
		alumno2.estudiar();
		
		Asignatura alumno3 = new Asignatura("Historia", 9.8);	
		alumno3.getAsignatura();
		alumno3.setAsignatura("Matemática");
		alumno3.getNota();
		alumno3.setNota(6.8);
		alumno3.study();
		
		Asignatura asignatura1 = new Asignatura("Programación", 9.0);
		Asignatura asignatura2 = new Asignatura("Física", 8.0);
		Alumno alumno4 = new Alumno("Hugo", "García", null,  8.9);
		Asignatura asignatura;
//		alumno2.setAsignaturaAlumno(asignatura2);
		alumno4.estudiar();
		
		System.out.print(alumno2.getNombre() + " " + alumno2.getApellidos());// + " tiene " + alumno2.getAsignaturaAlumno().getNota() + " en");
		System.out.println(" " + asignatura2.getAsignatura());
		System.out.print(alumno4.getNombre() + " " + alumno4.getApellidos());// + " tiene " + alumno4.getAsignaturaAlumno().getNota() + " en");
		System.out.println(" " + asignatura1.getAsignatura());
	}

}
