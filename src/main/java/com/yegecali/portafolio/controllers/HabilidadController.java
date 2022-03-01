package com.yegecali.portafolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yegecali.portafolio.models.Habilidad;
import com.yegecali.portafolio.services.IHabilidadService;

@RestController
@RequestMapping("/habilidad")
@CrossOrigin(origins="http://localhost:4200")
public class HabilidadController {

	@Autowired
	private IHabilidadService habilidadService;
	
	@GetMapping("/")
	public ResponseEntity<List<Habilidad>> getHabilidades(){
		List<Habilidad> habilidades = habilidadService.listaHabilidad();
		return new ResponseEntity<List<Habilidad>>(habilidades, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Habilidad> getHabilidadById(@PathVariable("id") Long id){
		if(!habilidadService.existeHabilidad(id)) {
			return new ResponseEntity("Habilidad no encontrada",HttpStatus.NOT_FOUND);
		}else {
			Habilidad habilidad = habilidadService.getHabilidadById(id).get();
			return new ResponseEntity(habilidad, HttpStatus.OK);
		}
	}
	@PostMapping("/")
	public ResponseEntity<Habilidad> createHabilidad(@RequestBody Habilidad habilidad){
		habilidadService.saveHabilidad(habilidad);
		return new ResponseEntity("Habilidad creada", HttpStatus.CREATED);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Habilidad> borrarHabilidad(@PathVariable("id") Long id){
		if(!habilidadService.existeHabilidad(id)) {
			return new ResponseEntity("Habilidad no encontrada", HttpStatus.NOT_FOUND);
		}else {
			habilidadService.deleteHabilidad(id);
			return new ResponseEntity("habilidad eliminada", HttpStatus.OK);
		}
		
	}
}
