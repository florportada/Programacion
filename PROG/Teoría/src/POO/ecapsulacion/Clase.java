package POO.ecapsulacion;

public class Clase {

	public static void main(String[] args) {
		Asignatura asignatura1Alumno1 = new Asignatura("Programación", 7.0);
		Asignatura asignatura2Alumno1 = new Asignatura("Matemáticas", 9.0);
		Asignatura [] asignaturasAlumno1 = {asignatura1Alumno1, asignatura2Alumno1};
		Alumno alumno1 = new Alumno("A1", "X1",  asignaturasAlumno1, ((asignatura1Alumno1.getNota() + asignatura1Alumno1.getNota()) / 2));
		
		Asignatura asignatura1Alumno2 = new Asignatura("Programación", 8.0);
		Asignatura asignatura2Alumno2 = new Asignatura("Matemáticas", 5.0);
		Asignatura [] asignaturasAlumno2 = {asignatura1Alumno2, asignatura2Alumno2};
		Alumno alumno2 = new Alumno("A2", "X2");
		alumno2.setAsignaturas(asignaturasAlumno2);
		alumno2.setNotaMedia((asignatura1Alumno2.getNota() + asignatura2Alumno2.getNota()) / 2);
		
		// Creo aula con alumnos
		Alumno [] alumnos = {alumno1, alumno2};
		
//		System.out.println("Alumno 1:");
//		System.out.println(alumnos[0].getAsignaturas()[0].getAsignatura() + " " + alumnos[0].getAsignaturas()[0].getNota());
//		System.out.println(alumnos[0].getAsignaturas()[1].getAsignatura() + " " + alumnos[0].getAsignaturas()[1].getNota());
//		System.out.println();
//		System.out.println("Alumno 2:");
//		System.out.println(alumnos[1].getAsignaturas()[0].getAsignatura() + " " + alumnos[1].getAsignaturas()[0].getNota());
//		System.out.println(alumnos[1].getAsignaturas()[1].getAsignatura() + " " + alumnos[1].getAsignaturas()[1].getNota());
//		System.out.println();
//		System.out.println("Notas Medias: ");
//		System.out.println("Alumno 1: " + alumnos[0].getNotaMedia());
//		System.out.println("Alumno 2: " + alumnos[1].getNotaMedia());
		System.out.println("Hay " + alumnos.length + " en clase, son:");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellidos());
			Asignatura [] asignaturasAlumnos = alumno.getAsignaturas();
			for (Asignatura asignatura: asignaturasAlumnos) {
				System.out.println("\t" + asignatura.getAsignatura() + ", nota: " + asignatura.getNota());
			}
		}
		double notasAlumnos = 0;
		int totalAsignaturas = 0;
		for (Alumno alumno:alumnos) {
			Asignatura [] asignaturasAlumnos = alumno.getAsignaturas();
			int numAsignaturasAlumnos = asignaturasAlumnos.length;
			totalAsignaturas += numAsignaturasAlumnos;
			for(Asignatura asignatura:asignaturasAlumnos) {
				notasAlumnos += asignatura.getNota();
			}
		}
		System.out.println();
		System.out.println("La nota media de todos los alumnos: " + notasAlumnos/totalAsignaturas);
		
		
		double notaMediaMasAlta = 0;
		Alumno alumnoNotaMediaMasAlta = null;
		for (Alumno alumno : alumnos) {
			double notasAlumno = 0;
			Asignatura [] asignaturasAlumnos = alumno.getAsignaturas();
			int numAsignaturasAlumnos = asignaturasAlumnos.length;
			for(Asignatura asignatura : asignaturasAlumnos) {
				notasAlumno += asignatura.getNota();
			}
			double mediaAlumno = notasAlumno/numAsignaturasAlumnos;
			
			if(mediaAlumno > notaMediaMasAlta) {
				notaMediaMasAlta = mediaAlumno;
				alumnoNotaMediaMasAlta = alumno;
			}
		}
		System.out.println("El alumno con la media más alta es " + alumnoNotaMediaMasAlta.getNombre() + " " + alumnoNotaMediaMasAlta.getApellidos() + " con un " + notaMediaMasAlta);

	}

}
