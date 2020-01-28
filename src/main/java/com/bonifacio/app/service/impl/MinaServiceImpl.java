package com.bonifacio.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonifacio.app.dao.IMinaDao;
import com.bonifacio.app.entities.Mina;
import com.bonifacio.app.service.IMinaService;


@Service
public class MinaServiceImpl implements IMinaService{

	@Autowired
	private IMinaDao minaDao;

	@Override
	public List<Mina> findAll() {
		
		return(List<Mina>)minaDao.findAll();
	
	}

	@Override
	public void saveMina(Mina mina) {
		minaDao.save(mina);
		
	}

	@Override
	public List<Mina> getMinasProyecto(Long proid) {
		
		return(List<Mina>)minaDao.findByMinproyecto(proid);
	}

	@Override
	public Mina findById(Long mina_id) {
	
		return minaDao.findById(mina_id).orElse(null);
	}

	@Override
	public void deleteById(Long mina_id) {
		
		minaDao.deleteById(mina_id);
		
	}
}
