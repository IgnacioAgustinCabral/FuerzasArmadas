package cabral.ignacio;

public class Anfibio extends Vehiculo implements TerrestreInterfaz,AcuaticoInterfaz {

	public Anfibio(String codigoIdentificacion, Integer capacidad, String nombre) {
		super(codigoIdentificacion, capacidad, nombre);
	}

	@Override
	public void desplazarsePorAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moversePorTierra() {
		// TODO Auto-generated method stub
		
	}

}
