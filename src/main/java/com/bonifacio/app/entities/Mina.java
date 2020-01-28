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
@Table(name="mina")
public class Mina implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long mina_id;
	
	private String nombre_min;
	private String lectura_horometro;
	private String placa;
	private String observacion;
	private String serie_motor;
	private String fecha_inicio;
	
	private Long minproyecto;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="repomina",referencedColumnName="mina_id")
	private List<Reporte>reporte =new ArrayList<>();
	

	
	public List<Reporte> getReporte() {
		return reporte;
	}



	public void setReporte(List<Reporte> reporte) {
		this.reporte = reporte;
	}



	public Mina() {
		
	}



	public Long getMina_id() {
		return mina_id;
	}



	public void setMina_id(Long mina_id) {
		this.mina_id = mina_id;
	}



	public String getNombre_min() {
		return nombre_min;
	}



	public void setNombre_min(String nombre_min) {
		this.nombre_min = nombre_min;
	}



	public String getLectura_horometro() {
		return lectura_horometro;
	}



	public void setLectura_horometro(String lectura_horometro) {
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



	public String getSerie_motor() {
		return serie_motor;
	}



	public void setSerie_motor(String serie_motor) {
		this.serie_motor = serie_motor;
	}



	public String getFecha_inicio() {
		return fecha_inicio;
	}



	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}



	public Long getMinproyecto() {
		return minproyecto;
	}



	public void setMinproyecto(Long minproyecto) {
		this.minproyecto = minproyecto;
	}



	@Override
	public String toString() {
		return "Mina [mina_id=" + mina_id + ", nombre_min=" + nombre_min + ", lectura_horometro=" + lectura_horometro
				+ ", placa=" + placa + ", observacion=" + observacion + ", serie_motor=" + serie_motor
				+ ", fecha_inicio=" + fecha_inicio + ", minproyecto=" + minproyecto + "]";
	}

	

	
	

	
}
