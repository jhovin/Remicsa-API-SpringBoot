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

import com.bonifacio.app.entities.Proyecto;
import com.bonifacio.app.entities.Superficie;
import com.bonifacio.app.service.ISuperficieService;

@RestController
@RequestMapping("/api")
public class SuperficieController {
	@Autowired
	private ISuperficieService superficieService;
	
	@GetMapping("/superficies")
	public ResponseEntity<?>listaSuperficies(){
		List<Superficie>listaSuperficies=superficieService.findAll();
		if(listaSuperficies!=null) {
			if(listaSuperficies.size()!=0) {
				return new ResponseEntity<>(listaSuperficies,HttpStatus.OK);
			}else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@GetMapping("/superficies/{superficie_id}")
	public Superficie obtener(@PathVariable(value="superficie_id")Long superficie_id) {
		Superficie sup=superficieService.findById(superficie_id);
		return sup;
	}
	
	
	@PostMapping("/superficies")
	public ResponseEntity<?>addSuperficies(@RequestBody Superficie superficie){
		superficieService.saveSuperficie(superficie);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping("/superficies_proyecto")
	public ResponseEntity<?>verSuperficieProyecto(@RequestBody Proyecto proyecto){
		List<Superficie>listaSuperficies=superficieService.getSuperficiesProyecto(proyecto.getProid());
		if(listaSuperficies!=null) {
			if(listaSuperficies.size()!=0) {
				return new ResponseEntity<>(listaSuperficies,HttpStatus.OK);
			}else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@DeleteMapping("/superficies/{superficie_id}")
	 public ResponseEntity<Void>deleteSuperficie(@PathVariable(value="superficie_id")Long superficie_id){
		superficieService.deleteById(superficie_id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
		
}
