
package com.backEndSpringBoot.Spring.Boot.Repository;

import com.backEndSpringBoot.Spring.Boot.Model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    public List<Experiencia> findByIdPersona(Long idPersona);
}
