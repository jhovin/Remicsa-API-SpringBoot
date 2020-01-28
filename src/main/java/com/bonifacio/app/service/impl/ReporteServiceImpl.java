package com.bonifacio.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bonifacio.app.dao.IReporteDao;
import com.bonifacio.app.entities.Reporte;
import com.bonifacio.app.service.IReporteService;

@Service
public class ReporteServiceImpl implements IReporteService{
	
	@Autowired
	private IReporteDao reporteDao;
	

	@Override
	@Transactional(readOnly=true)
	public List<Reporte> findAll() {
		return(List<Reporte>)reporteDao.findAll();
	}

	@Override
	public void saveReporte(Reporte reporte) {
		reporteDao.save(reporte);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Reporte findById(Long reporte_id) {
		return reporteDao.findById(reporte_id).orElse(null);
	}

	@Override
	public void deleteById(Long reporte_id) {
	
		reporteDao.deleteById(reporte_id);;
	}
}
	
	
