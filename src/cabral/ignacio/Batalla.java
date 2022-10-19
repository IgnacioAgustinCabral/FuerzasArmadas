package cabral.ignacio;

import java.util.LinkedList;
import java.util.List;

public class Batalla {
	private String nombre;
	private Integer inicio;
	private Integer fin;
	private List<Vehiculo> convoy = new LinkedList<>();
	
	public Batalla(String nombre, Integer inicio, Integer fin) {
		super();
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
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

	public List<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(List<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public void agregarVehiculoAConvoy(Vehiculo vehiculo) {
		this.getConvoy().add(vehiculo);
	}
	
}
