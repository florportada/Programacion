package Vehículos;

public class Garage {
	private String nombre;
	private Coches[] coches;
	private Motos[] motos;
	private Bicicletas[] bicis;

	public Garage(String nombre) {
		this.nombre = nombre;
		motos = new Motos[2];
		coches = new Coches[2];
		bicis = new Bicicletas[2];
	}

	public Garage(String nombre, int numMotos, int numCoches, int numBicicletas) {
		this.nombre = nombre;
		motos = new Motos[numMotos];
		coches = new Coches[numCoches];
		bicis = new Bicicletas[numBicicletas];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void aparcar(Vehiculos[] vehiculos) {
		for (Vehiculos vehiculo : vehiculos) {
			if (vehiculo instanceof VehiculosMotor) {
				VehiculosMotor vm = (VehiculosMotor) vehiculo;
				System.out.println("Aparcando vehiculo con matricula " + vm.getPatente());
			} else {
				Bicicletas bici = (Bicicletas) vehiculo;
				System.out.println("Aparcando la bici de marca " + bici.getMarca());
				boolean hayPlazasLibres = false;

				for (int i = 0; i < bicis.length; i++) {
					if (bicis[i] == null) {
						bicis[i] = bici;
						System.out.println(
								"Aparcada la bici de marca " + bici.getMarca() + " con " + bici.getMarchas() + " marchas ");
						hayPlazasLibres = true;
					}
				}
				if (!hayPlazasLibres) {
					System.out.println("No hay plazas libres para la bici de marca " + bici.getMarca() + " con "
							+ bici.getMarchas() + " marchas ");
				}
			}
		}
	}

}
