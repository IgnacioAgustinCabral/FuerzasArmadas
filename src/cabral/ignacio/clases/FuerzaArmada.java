package cabral.ignacio.clases;

import java.util.HashSet;
import java.util.Set;


public class FuerzaArmada {
	private Integer fechaDeCreacion;
	private Integer numeroTotalDeTropas;
	private Set<Batalla> batallas = new HashSet<>();

	public FuerzaArmada(Integer fechaDeCreacion, Integer numeroTotalDeTropas) {
		this.fechaDeCreacion = fechaDeCreacion;
		this.numeroTotalDeTropas = numeroTotalDeTropas;
	}

	public Integer getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(Integer fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public Integer getNumeroTotalDeTropas() {
		return numeroTotalDeTropas;
	}

	public void setNumeroTotalDeTropas(Integer numeroTotalDeTropas) {
		this.numeroTotalDeTropas = numeroTotalDeTropas;
	}

	public Set<Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(Set<Batalla> batallas) {
		this.batallas = batallas;
	}

	public void agregarBatalla(Batalla batalla) {
		this.getBatallas().add(batalla);
	}

	public Boolean buscarBatalla(Batalla batallaABuscar) {
		Set<Batalla> batallas = this.getBatallas();
		return batallas.contains(batallaABuscar);
	}

//	public Batalla crearBatalla(String nombre, Integer inicio, Integer fin, TipoBatalla tipo) {
//		
//		return new Batalla(nombre,inicio,fin,tipo);
//	}
	
	
}
