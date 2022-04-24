
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
public class Contact {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String nameUbication;
    String mail;
    Long idPersona;

    public Contact() {
    }

    public Contact(Long id, String nameUbication, String mail, Long idPersona) {
        this.id = id;
        this.nameUbication = nameUbication;
        this.mail = mail;
        this.idPersona = idPersona;
    }
    
    
    

	}
