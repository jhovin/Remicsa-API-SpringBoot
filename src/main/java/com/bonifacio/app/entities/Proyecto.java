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
@Table(name="proyectos")
public class Proyecto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long proid;
	private String nombre;
	private String cliente;
	private String distrito;
	private String provincia;
	private String departamento;
	private String gerente;
	private String telefono;
	private String imagen;
	private Long prousuario;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="minproyecto",referencedColumnName="proid")
	private List<Mina>mina =new ArrayList<>();
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="supproyecto",referencedColumnName="proid")
	private List<Superficie>superficie=new ArrayList<>();
	
	
	
	

	public List<Superficie> getSuperficie() {
		return superficie;
	}


	public void setSuperficie(List<Superficie> superficie) {
		this.superficie = superficie;
	}


	public List<Mina> getMina() {
		return mina;
	}


	public void setMina(List<Mina> mina) {
		this.mina = mina;
	}


	public Proyecto() {
		
	}
	

	public Long getProid() {
		return proid;
	}

	public void setProid(Long proid) {
		this.proid = proid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Long getProusuario() {
		return prousuario;
	}

	public void setProusuario(Long prousuario) {
		this.prousuario = prousuario;
	}

	@Override
	public String toString() {
		return "Proyecto [proid=" + proid + ", nombre=" + nombre + ", cliente=" + cliente + ", distrito=" + distrito
				+ ", provincia=" + provincia + ", departamento=" + departamento + ", gerente=" + gerente + ", telefono="
				+ telefono + ", imagen=" + imagen + ", prousuario=" + prousuario + "]";
	}

}
