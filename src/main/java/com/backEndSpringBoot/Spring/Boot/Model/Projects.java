
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
public class Projects {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String name;
    String description;
    String imgProject;
    Long idPersona;

    public Projects() {
    }

    public Projects(Long id, String name, String description, String imgProject, Long idPersona) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgProject = imgProject;
        this.idPersona = idPersona;
    }
    
    
    
    
}
