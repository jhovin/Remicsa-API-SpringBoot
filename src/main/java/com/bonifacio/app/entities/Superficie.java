package com.bonifacio.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="superficie")
public class Superficie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long superficie_id;
	private String nombre_sup;
	private Integer lectura_horometro;
	private String placa;
	private String observacion;
	private Integer serie_motor;
	private String fecha_inicio;
	private Long supproyecto;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="reposuperficie",referencedColumnName="superficie_id")
	private List<Reporte>reporte=new ArrayList<>();
	
	
	public List<Reporte> getReporte() {
		return reporte;
	}

	public void setReporte(List<Reporte> reporte) {
		this.reporte = reporte;
	}
	
	
	public Superficie() {
	
	}

	public Long getSuperficie_id() {
		return superficie_id;
	}


	public void setSuperficie_id(Long superficie_id) {
		this.superficie_id = superficie_id;
	}


	public String getNombre_sup() {
		return nombre_sup;
	}

	public void setNombre_sup(String nombre_sup) {
		this.nombre_sup = nombre_sup;
	}


	public Integer getLectura_horometro() {
		return lectura_horometro;
	}


	public void setLectura_horometro(Integer lectura_horometro) {
		this.lectura_horometro = lectura_horometro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public Integer getSerie_motor() {
		return serie_motor;
	}

	public void setSerie_motor(Integer serie_motor) {
		this.serie_motor = serie_motor;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}
	
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}


	public Long getSupproyecto() {
		return supproyecto;
	}

	public void setSupproyecto(Long supproyecto) {
		this.supproyecto = supproyecto;
	}





	@Override
	public String toString() {
		return "Superficie [superficie_id=" + superficie_id + ", nombre_sup=" + nombre_sup + ", lectura_horometro="
				+ lectura_horometro + ", placa=" + placa + ", observacion=" + observacion + ", serie_motor="
				+ serie_motor + ", fecha_inicio=" + fecha_inicio + ", supproyecto=" + supproyecto + "]";
	}
	
	

}
