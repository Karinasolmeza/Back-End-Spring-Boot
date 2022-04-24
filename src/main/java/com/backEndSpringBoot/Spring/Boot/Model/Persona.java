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

public class Persona  {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id; 
    @Basic
    String fullName;
    String tituloEncabezado;
    String avatarImg;
 
    public Persona() {
    }
    
    
    public Persona(Long id, String fullName, String tituloEncabezado, String avatarImg) {
        this.id = id;
        this.fullName = fullName;
        this.tituloEncabezado = tituloEncabezado;
        this.avatarImg = avatarImg;
    }

    

 
    
}

