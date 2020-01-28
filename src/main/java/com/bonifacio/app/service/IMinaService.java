package com.bonifacio.app.service;

import java.util.List;

import com.bonifacio.app.entities.Mina;



public interface IMinaService{
	
	public List<Mina>findAll();
	
	public void saveMina(Mina mina);
	
	public List<Mina>getMinasProyecto(Long proid);
	
	public Mina findById(Long mina_id);
	
	public void deleteById(Long mina_id);
	
	
}
