package cabral.ignacio.clases;

import cabral.ignacio.interfaces.Acuatico;
import cabral.ignacio.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Acuatico, Volador {

	public HidroAvion(String codigoIdentificacion, Integer capacidad) {
		super(codigoIdentificacion, capacidad);
		llenarListaAptoBatalla();
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void desplazarsePorAgua() {
		// TODO Auto-generated method stub

	}

	@Override
	public void llenarListaAptoBatalla() {
		this.getAptoBatalla().add(TipoBatalla.ACUATICA);
		this.getAptoBatalla().add(TipoBatalla.AEREA);
	}
	
}
