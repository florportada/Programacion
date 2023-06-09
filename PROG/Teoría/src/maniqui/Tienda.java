package maniqui;

public class Tienda {
	private String nombre;

	public Tienda(String nombre) {
		super();
		this.setNombre(nombre);
	}

	public static void main(String[] args) {
		Tienda tienda = new Tienda("Zara");
		tienda.abrirTienda();

//		Boton boton1 = new Boton("Plateado", "Circular", "Pequeño");
//		Boton boton2 = new Boton("Azul", "Circular", "Pequeño");
//		Boton boton3 = new Boton("Negro", "Cuadrado", "Pequeño");
//		Boton boton4 = new Boton("Rojo", "Palo", "Pequeño");
//		Boton[] botones= {boton1, boton2, boton3, boton4};
//		
//		Pantalon pantalon = new Pantalon("M", 25.99, "Azul", boton1);
//		Camisa camisa = new Camisa("M", 15.69, "Blanco", botones);
//		Vestido vestido = new Vestido("M", 25.56, "Rojo");
//		
//		Maniqui maniqui1 = new Maniqui("1");
//		Maniqui maniqui2 = new Maniqui("2");
	}

	public void abrirTienda() {
		Maniqui[] maniquis = crearManiquis();
//		maniquis[0].getCamisa().getColor();
		precioManiqui(maniquis);
	}

	private void precioManiqui(Maniqui[] maniquis) {
		for (Maniqui maniqui : maniquis) {
			double total = 0;
					 
			if(maniqui.getCamisa() != null) {
				total += maniqui.getCamisa().getPrecio();
			}
			if(maniqui.getPantalon() != null) {
				total += maniqui.getPantalon().getPrecio();
			}
			if(maniqui.getVestido() != null) {
				total += maniqui.getVestido().getPrecio();
			}
			System.out.println("El total del maniqui " + maniqui.getId() + " es " + total + "€");
		}
	}

	private Maniqui[] crearManiquis() {
		Boton boton1 = new Boton("Plateado", "Circular", "Pequeño");
		Boton boton2 = new Boton("Azul", "Circular", "Pequeño");
		Boton boton3 = new Boton("Negro", "Cuadrado", "Pequeño");
		Boton boton4 = new Boton("Rojo", "Palo", "Pequeño");
		Boton[] botones = { boton1, boton2, boton3, boton4 };
//		Boton [] boton = new Boton[4];
//		for(int i=0; i>4; i++) {
//			Boton botoni = new Boton("Blanco" + (i+1), "Circular", "Pequeño");
//			boton[i]= botoni;
//		}
		Camisa camisa = new Camisa("M", 15.69, "Blanco");
		camisa.setBotones(botones);

		Pantalon pantalon = new Pantalon("M", 25.99, "Azul", boton1);
		Vestido vestido = new Vestido("M", 25.56, "Rojo");

		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2);

		maniqui1.vestirVestido(vestido);
		maniqui1.vestir(camisa, pantalon);

		maniqui2.vestirVestido(vestido);

		Maniqui[] maniquis = { maniqui1, maniqui2 };
		return maniquis;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
