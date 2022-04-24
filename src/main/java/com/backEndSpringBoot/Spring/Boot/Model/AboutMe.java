
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
public class AboutMe  {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id; 
    @Basic
    String acercaDe;
    Long idPersona;

    public AboutMe() {
    }
    
    
    

    public AboutMe(Long id, String acercaDe, Long idPersona) {
        this.id = id;
        this.acercaDe = acercaDe;
        this.idPersona= idPersona;
    }
    


    
}

