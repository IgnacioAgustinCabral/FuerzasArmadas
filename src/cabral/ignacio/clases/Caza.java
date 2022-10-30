package cabral.ignacio.clases;


import cabral.ignacio.interfaces.Volador;

public class Caza extends Vehiculo implements Volador {
	
	public Caza(String codigoIdentificacion, Integer capacidad) {
		super(codigoIdentificacion, capacidad);
		llenarListaAptoBatalla();
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void llenarListaAptoBatalla() {
		this.getAptoBatalla().add(TipoBatalla.AEREA);
	}

	
}
