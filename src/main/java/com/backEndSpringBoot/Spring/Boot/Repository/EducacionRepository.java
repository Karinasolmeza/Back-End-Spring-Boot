
package com.backEndSpringBoot.Spring.Boot.Repository;

import com.backEndSpringBoot.Spring.Boot.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository  extends JpaRepository<Educacion, Long>{
   // public List<Educacion> findByIdPersona(Long idPersona);
  

}
