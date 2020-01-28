package com.bonifacio.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonifacio.app.dao.ISuperficieDao;
import com.bonifacio.app.entities.Superficie;
import com.bonifacio.app.service.ISuperficieService;

@Service
public class SuperficieServiceImpl implements ISuperficieService{
	
	
	@Autowired
	private ISuperficieDao superficieDao;
	
	@Override
	public List<Superficie> findAll() {
		
		return(List<Superficie>)superficieDao.findAll();
	}

	@Override
	public void saveSuperficie(Superficie superficie) {
		
		superficieDao.save(superficie);
	}

	@Override
	public List<Superficie> getSuperficiesProyecto(Long proid) {
		
		return(List<Superficie>)superficieDao.findBySupproyecto(proid);
	}

	@Override
	public Superficie findById(Long superficie_id) {
		return superficieDao.findById(superficie_id).orElse(null);
	}

	@Override
	public void deleteById(Long superficie_id) {
		
		superficieDao.deleteById(superficie_id);
		
	}

}
