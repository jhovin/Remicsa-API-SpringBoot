package com.bonifacio.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonifacio.app.entities.Mina;
import com.bonifacio.app.entities.Proyecto;

import com.bonifacio.app.service.IMinaService;

@RestController
@RequestMapping("/api")
public class MinasController {

	
	@Autowired
	private IMinaService minaService;
	
	@GetMapping("/minas")
	public ResponseEntity<?>listaMinas(){
		List<Mina>listaMinas=minaService.findAll();
		if(listaMinas!=null) {
			if(listaMinas.size()!=0) {
				return new ResponseEntity<>(listaMinas,HttpStatus.OK);
			}else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@GetMapping("/minas/{mina_id}")
	public Mina obtener(@PathVariable(value="mina_id")Long mina_id) {
		Mina min=minaService.findById(mina_id);
		return min;
	}
	
	
	@PostMapping("/minas")
	public ResponseEntity<?>addMinas(@RequestBody Mina mina){
		minaService.saveMina(mina);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping("/minas_proyecto")
	public ResponseEntity<?>verMinaProyecto(@RequestBody Proyecto proyecto){
		List<Mina>listaMinas=minaService.getMinasProyecto(proyecto.getProid());
		if(listaMinas!=null) {
			if(listaMinas.size()!=0) {
				return new ResponseEntity<>(listaMinas,HttpStatus.OK);
			}else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@DeleteMapping("/minas/{mina_id}")
	 public ResponseEntity<Void>deleteMina(@PathVariable(value="mina_id")Long mina_id){
		minaService.deleteById(mina_id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
		
}
