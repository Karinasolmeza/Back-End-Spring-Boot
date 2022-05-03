
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
public class Footer {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Basic
    String linkFacebook;
    String linkInstagram;
    String linkTwitter;
    String linkEdin;
    Long idPersona;

    public Footer() {
    }

    public Footer(Long Id, String linkFacebook, String linkInstagram, String linkTwitter, String linkEdin, Long idPersona) {
        this.Id = Id;
        this.linkFacebook = linkFacebook;
        this.linkInstagram = linkInstagram;
        this.linkTwitter = linkTwitter;
        this.linkEdin = linkEdin;
        this.idPersona = idPersona;
    }

    
}
