package cabral.ignacio;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import cabral.ignacio.clases.Anfibio;
import cabral.ignacio.clases.Batalla;
import cabral.ignacio.clases.Caza;
import cabral.ignacio.clases.Destructor;
import cabral.ignacio.clases.FuerzaArmada;
import cabral.ignacio.clases.HidroAvion;
import cabral.ignacio.clases.Submarino;
import cabral.ignacio.clases.Tanque;
import cabral.ignacio.clases.TipoBatalla;
import cabral.ignacio.clases.Vehiculo;
import cabral.ignacio.excepciones.VehiculoIncompatibleException;

public class FuerzasArmadasTest {

	@Test
	public void seCreanTanques() {
		Vehiculo tanque = new Tanque("SU-32", 4);
		assertNotNull(tanque);

	}

	@Test
	public void seCreanSubmarino() {
		Vehiculo submarino = new Submarino("AR-22", 29);
		assertNotNull(submarino);

	}

	@Test
	public void seCreanBarcos() {
		Vehiculo barco = new Destructor("AR-22", 29);
		assertNotNull(barco);

	}

	@Test
	public void seCreanAvion() {
		Vehiculo avion = new Caza("ZX-32", 1);
		assertNotNull(avion);

	}

	@Test
	public void seCreanAnfibios() {
		Vehiculo anfibio = new Anfibio("RA-32", 18);
		assertNotNull(anfibio);
	}

	@Test
	public void seCreanHidroaviones() {
		Vehiculo hidro = new HidroAvion("PA-32", 18);
		assertNotNull(hidro);
	}

	@Test
	public void sePuedeCrearFuerzaArmadaYAgregarleBatallas() {
		FuerzaArmada argentina = new FuerzaArmada(1810, 150000);
		Batalla batalla1 = argentina.crearBatalla("Guerra de Sudafrica", 2025, 2026, TipoBatalla.TERRESTRE);
		Batalla batalla2 = argentina.crearBatalla("Guerra del Peru", 2025, 2026, TipoBatalla.TERRESTRE,TipoBatalla.ACUATICA);

		argentina.agregarBatalla(batalla1);
		argentina.agregarBatalla(batalla2);

		Boolean estaEnSet = argentina.buscarBatalla(batalla1);

		assertTrue(estaEnSet);

	}

	@Test
	public void sePuedeCrearBatallasYAgregarVehiculosAlConvoyYSaberLaCantidad() {
		FuerzaArmada argentina = new FuerzaArmada(1810, 150000);
		Batalla batalla = argentina.crearBatalla("Guerra del Golfo", 1990, 1991, TipoBatalla.AEREA);
		argentina.agregarBatalla(batalla);

		Vehiculo tanque = new Tanque("SU-32", 4);
		Vehiculo submarino = new Submarino("AR-22", 29);
		Vehiculo barco = new Destructor("AR-22", 29);
		Vehiculo caza = new Caza("ZX-32", 1);
		Vehiculo anfibio = new Anfibio("RA-32", 18);
		Vehiculo hidro = new HidroAvion("PA-32", 18);
		
		
		
			try {
				batalla.agregarVehiculoAConvoy(tanque);
			} catch (VehiculoIncompatibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				batalla.agregarVehiculoAConvoy(submarino);
			} catch (VehiculoIncompatibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				batalla.agregarVehiculoAConvoy(barco);
			} catch (VehiculoIncompatibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				batalla.agregarVehiculoAConvoy(caza);
			} catch (VehiculoIncompatibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				batalla.agregarVehiculoAConvoy(anfibio);
			} catch (VehiculoIncompatibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				batalla.agregarVehiculoAConvoy(hidro);
			} catch (VehiculoIncompatibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		Integer cantidadEsperadaDeVehiculosEnConvoy = 2;
		Integer cantidadDeVehiculos = batalla.getConvoy().size();

		assertEquals(cantidadEsperadaDeVehiculosEnConvoy, cantidadDeVehiculos);
	}

	@Test
	public void soloSePuedenEnviarAlConvoyDeterminadosVehiculosAptoParaTipoBatalla() {

	}

}