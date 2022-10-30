package cabral.ignacio.clases;

import cabral.ignacio.interfaces.Acuatico;

public class Destructor extends Vehiculo implements Acuatico {

	public Destructor(String codigoIdentificacion, Integer capacidad) {
		super(codigoIdentificacion, capacidad);
		llenarListaAptoBatalla();
	}

	@Override
	public void desplazarsePorAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void llenarListaAptoBatalla() {
		this.getAptoBatalla().add(TipoBatalla.ACUATICA);
	}

}
