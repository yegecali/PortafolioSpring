package com.yegecali.portafolio.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yegecali.portafolio.models.Habilidad;

@Repository
public interface IHabilidadRepo extends JpaRepository<Habilidad, Long>{

}
