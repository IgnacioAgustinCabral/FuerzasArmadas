package cabral.ignacio.clases;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo> {
	private String codigoIdentificacion;
	private Integer capacidad;

	public Vehiculo(String codigoIdentificacion, Integer capacidad) {
		this.codigoIdentificacion = codigoIdentificacion;
		this.capacidad = capacidad;
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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoIdentificacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigoIdentificacion, other.codigoIdentificacion);
	}

	@Override
	public int compareTo(Vehiculo o) {
		return this.getCodigoIdentificacion().compareTo(o.getCodigoIdentificacion());
	}

}
