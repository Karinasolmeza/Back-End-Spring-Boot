
package com.backEndSpringBoot.Spring.Boot.Repository;

import com.backEndSpringBoot.Spring.Boot.Model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long>{
   // public List<Skills> findByIdPersona(Long idPersona);
    
}
