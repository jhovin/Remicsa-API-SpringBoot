package com.bonifacio.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bonifacio.app.entities.Mina;

public interface IMinaDao extends CrudRepository<Mina,Long> {
	
	public List<Mina>findByMinproyecto(Long proid);

}
