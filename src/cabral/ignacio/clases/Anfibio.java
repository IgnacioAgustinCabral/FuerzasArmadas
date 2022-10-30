package cabral.ignacio.clases;

import java.util.ArrayList;
import java.util.List;

import cabral.ignacio.interfaces.Acuatico;
import cabral.ignacio.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Terrestre,Acuatico {
	
	public Anfibio(String codigoIdentificacion, Integer capacidad) {
		super(codigoIdentificacion, capacidad);
		llenarListaAptoBatalla();
	}

	@Override
	public void desplazarsePorAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moversePorTierra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void llenarListaAptoBatalla() {
		this.getAptoBatalla().add(TipoBatalla.TERRESTRE);
		this.getAptoBatalla().add(TipoBatalla.ACUATICA);
		
	}


}
