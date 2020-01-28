package com.bonifacio.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bonifacio.app.entities.Superficie;

public interface ISuperficieDao extends CrudRepository<Superficie,Long> {

	public List<Superficie>findBySupproyecto(Long proid);
	
}
