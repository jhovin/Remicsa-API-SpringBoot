package com.bonifacio.app.service;

import java.util.List;

import com.bonifacio.app.entities.Reporte;

public interface IReporteService {
	
	public List<Reporte> findAll();
	
	public void saveReporte(Reporte reporte);
	
	public Reporte findById(Long reporte_id);
	
	public void deleteById(Long reporte_id);
	
	
	

}
