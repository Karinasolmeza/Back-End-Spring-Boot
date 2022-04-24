
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backEndSpringBoot.Spring.Boot.Repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{
     
@Autowired
PersonaRepository personaRepo;

@Override
    public void crearPersona(Persona  persona ) {
        personaRepo.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public List<Persona> listarPersonas() {
        return personaRepo.findAll();
    }
    
    public Persona obtenerPersona(Long id){
        return personaRepo.findById(id).orElse(null);
    }

    public void modificarPersona (Persona persona){
        personaRepo.save(persona);
    }
    
}
