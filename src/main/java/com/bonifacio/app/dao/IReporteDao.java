package com.bonifacio.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bonifacio.app.entities.Reporte;

public interface IReporteDao extends CrudRepository<Reporte,Long>{
	
	public List<Reporte>findByRepomina(Long mina_id);

}
