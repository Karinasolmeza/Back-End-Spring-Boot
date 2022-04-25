package com.backEndSpringBoot.Spring.Boot.Repository;

import com.backEndSpringBoot.Spring.Boot.Model.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeRepository extends JpaRepository<AboutMe, Long>{
    //public AboutMe findByIdPersona(Long idPersona);

    
    
}




