
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Persona;
import java.util.List;

public interface IPersonaService {
    public void crearPersona (Persona persona);
    public void borrarPersona (Long id);
    public List<Persona> listarPersonas();

    
    }

