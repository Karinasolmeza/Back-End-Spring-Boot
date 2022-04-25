
package com.backEndSpringBoot.Spring.Boot.Repository;

import com.backEndSpringBoot.Spring.Boot.Model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
   // public List<Experiencia> findByIdPersona(Long idPersona);
}
