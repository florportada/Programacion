package Vehículos;

public class UtilsCiudad {
	public static Vehiculos[] generaVehiculos() {
		Coches coche1 = new Coches("RGS-342", "Modelo1", "Marca1", 2018, 5, "Gasolina");
		Coches coche2 = new Coches("RPO-098", "Modelo2", "Marca2", 2020, 3, "Disel");
		Coches coche3 = new Coches("FDS-567", "Modelo3", "Marca3", 2016, 5, "Gasolina");

		Motos moto1 = new Motos("UYI-986", "Modelo1", "Marca1", 2018);
		Motos moto2 = new Motos("GSD-235", "Modelo2", "Marca2", 2021);

		Bicicletas bici1 = new Bicicletas("modelo1", "marca1", 2019, 7);
		Bicicletas bici2 = new Bicicletas("modelo2", "marca2", 2020, 4);

		Vehiculos[] vehiculos = { coche1, coche2, coche3, moto1, moto2, bici1, bici2 };
		return vehiculos;

	}

}
