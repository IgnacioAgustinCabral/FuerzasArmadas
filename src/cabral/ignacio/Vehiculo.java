package cabral.ignacio;

public class Vehiculo {
	private String codigoIdentificacion;
	private Integer capacidad;
	private String nombre;

	public Vehiculo(String codigoIdentificacion, Integer capacidad, String nombre) {
		this.codigoIdentificacion = codigoIdentificacion;
		this.capacidad = capacidad;
		this.nombre = nombre;
	}

	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}

	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
