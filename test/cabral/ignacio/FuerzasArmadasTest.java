package cabral.ignacio;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuerzasArmadasTest {

	@Test
	public void seCreanVehiculosTerrestres() {
		Vehiculo terrestre = new Terrestre("SU-32", 5, "Sucucho");
		assertNotNull(terrestre);

	}

	@Test
	public void seCreanVehiculosAcuaticos() {
		Vehiculo acuatico = new Acuatico("AR-22", 29, "Arena");
		assertNotNull(acuatico);

	}

	@Test
	public void seCreanVehiculosVoladores() {
		Vehiculo volador = new Volador("ZX-32", 1, "Zixor");
		assertNotNull(volador);

	}

	@Test
	public void seCreanVehiculosAnfibios() {
		Vehiculo anfibio = new Anfibio("RA-32", 18, "Rana");
		assertNotNull(anfibio);
	}

	@Test
	public void seCreanVehiculosHidroaviones() {
		Vehiculo hidro = new HidroAvion("PA-32", 18, "Pato");
		assertNotNull(hidro);
	}

	@Test
	public void sePuedeCrearBatallasYAgregarVehiculosAlConvoyYSaberLaCantidad() {
		Batalla batalla = new Batalla("Irak",1992,1994);
		Vehiculo terrestre = new Terrestre("SU-32",5,"Sucucho");
		Vehiculo acuatico = new Acuatico("AR-22",29,"Arena");
		Vehiculo volador = new Volador("ZX-32",1,"Zixor");		
		Vehiculo anfibio = new Anfibio("RA-32",18,"Rana");
		Vehiculo hidro = new HidroAvion("PA-32",18,"Pato");
		batalla.agregarVehiculoAConvoy(terrestre);
		batalla.agregarVehiculoAConvoy(acuatico);
		batalla.agregarVehiculoAConvoy(volador);
		batalla.agregarVehiculoAConvoy(anfibio);
		batalla.agregarVehiculoAConvoy(hidro);
		
		Integer cantidadEsperadaDeVehiculosEnConvoy = 5;
		Integer cantidadDeVehiculos = batalla.getConvoy().size();
		
		assertEquals(cantidadEsperadaDeVehiculosEnConvoy, cantidadDeVehiculos);
	}
}