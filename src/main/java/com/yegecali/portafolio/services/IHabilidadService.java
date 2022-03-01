package com.yegecali.portafolio.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yegecali.portafolio.models.Habilidad;
import com.yegecali.portafolio.repositorys.IHabilidadRepo;

@Service
@Transactional
public class IHabilidadService{

	@Autowired
	private IHabilidadRepo habilidadRepo;
	
	public List<Habilidad> listaHabilidad(){
		return habilidadRepo.findAll();
	}
	public Optional<Habilidad> getHabilidadById(Long id){
		return habilidadRepo.findById(id);
	}
	public void saveHabilidad(Habilidad habilidad) {
		habilidadRepo.save(habilidad);
	}
	public void deleteHabilidad(Long id) {
		habilidadRepo.deleteById(id);	
	}
	public boolean existeHabilidad(Long id) {
		return habilidadRepo.existsById(id);
	}
	
	
}
