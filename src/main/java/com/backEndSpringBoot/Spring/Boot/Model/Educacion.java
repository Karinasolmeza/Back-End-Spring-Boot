
package com.backEndSpringBoot.Spring.Boot.Model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity

public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String title;
    String school;
    String resume;
    Long idPersona; 
   
 
    public Educacion() {
    }

    public Educacion(Long id, String title, String school, String resume, Long idPersona) {
        this.id = id;
        this.title = title;
        this.school = school;
        this.resume = resume;
        this.idPersona = idPersona;
    }

  
        
    
}
