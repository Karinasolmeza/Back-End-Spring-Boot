
package com.backEndSpringBoot.Spring.Boot.Repository;

import com.backEndSpringBoot.Spring.Boot.Model.Projects;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectsRepository extends JpaRepository<Projects, Long>{
    public List<Projects> findByIdPersona(Long idPersona);
}
