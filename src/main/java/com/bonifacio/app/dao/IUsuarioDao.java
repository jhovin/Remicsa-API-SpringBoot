package com.bonifacio.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bonifacio.app.entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,Long>{
	
	public Usuario findByEmail(String email);
	
	public Usuario findByEmailAndPassword(String email,String password);
	
	public Optional<Usuario> findById(Long id);
	
	@Query("select u from Usuario u where u.id=?1")
	public Usuario findByIdSQL(Long id);
	

}
