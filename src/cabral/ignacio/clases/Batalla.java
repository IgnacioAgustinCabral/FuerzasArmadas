package cabral.ignacio.clases;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Batalla implements Comparable<Batalla>{
	private String nombre;
	private Integer inicio;
	private Integer fin;
	private Set<Vehiculo> convoy = new HashSet<>();
	private TipoBatalla tipo;
	
	public Batalla(String nombre, Integer inicio, Integer fin, TipoBatalla tipo) {
		super();
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getInicio() {
		return inicio;
	}

	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}

	public Integer getFin() {
		return fin;
	}

	public void setFin(Integer fin) {
		this.fin = fin;
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}
	
	public TipoBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoBatalla tipo) {
		this.tipo = tipo;
	}

	public void agregarVehiculoAConvoy(Vehiculo vehiculo) {
		this.getConvoy().add(vehiculo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batalla other = (Batalla) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Batalla o) {
		return this.getNombre().compareTo(o.getNombre());
	}
		
	
}
