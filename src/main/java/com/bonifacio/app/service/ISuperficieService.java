package com.bonifacio.app.service;

import java.util.List;


import com.bonifacio.app.entities.Superficie;

public interface ISuperficieService {
	
	public List<Superficie>findAll();
	
	public void saveSuperficie(Superficie superficie);
	
	public List<Superficie>getSuperficiesProyecto(Long proid);
	
	public Superficie findById(Long superficie_id);
	
	public void deleteById(Long superficie_id);
	

}
