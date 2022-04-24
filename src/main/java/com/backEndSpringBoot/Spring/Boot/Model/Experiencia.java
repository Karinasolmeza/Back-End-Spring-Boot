
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
public class Experiencia {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String tipoExperiencia;
    String empresa;
    String detallesDeExperiencia;
    Long idPersona;

    public Experiencia() {
    }

    public Experiencia(Long id, String tipoExperiencia, String empresa, String detallesDeExperiencia, Long idPersona) {
        this.id = id;
        this.tipoExperiencia = tipoExperiencia;
        this.empresa = empresa;
        this.detallesDeExperiencia = detallesDeExperiencia;
        this.idPersona = idPersona;
    }
    
    
        
}
