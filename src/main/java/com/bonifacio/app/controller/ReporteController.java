package com.bonifacio.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bonifacio.app.entities.Reporte;
import com.bonifacio.app.service.IReporteService;

@RestController
@RequestMapping("/api")
public class ReporteController {
	
	@Autowired
	private IReporteService reporteService;
	
	@GetMapping("/reportes")
	public ResponseEntity<?>listaReportes(){
		List<Reporte>listaReportes=reporteService.findAll();
		if(listaReportes!=null) {
			if(listaReportes.size()!=0) {
				return new ResponseEntity<>(listaReportes,HttpStatus.OK);
			}else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@GetMapping("/reportes/{reporte_id}")
	public Reporte obtener(@PathVariable(value="reporte_id")Long reporte_id) {
		Reporte repo=reporteService.findById(reporte_id);
		return repo;
	}
	
	
	@PostMapping("/reportes")
	public ResponseEntity<?>addReportes(@RequestBody Reporte reporte){
		reporteService.saveReporte(reporte);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@DeleteMapping("/reportes/{reporte_id}")
	 public ResponseEntity<Void>deleteMina(@PathVariable(value="reporte_id")Long reporte_id){
		reporteService.deleteById(reporte_id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
}
