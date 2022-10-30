package cabral.ignacio.clases;

import cabral.ignacio.interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre {

	public Tanque(String codigoIdentificacion, Integer capacidad) {
		super(codigoIdentificacion, capacidad);
		llenarListaAptoBatalla();
	}

	@Override
	public void moversePorTierra() {
		// TODO Auto-generated method stub

	}

	@Override
	public void llenarListaAptoBatalla() {
		this.getAptoBatalla().add(TipoBatalla.TERRESTRE);
	}

}
