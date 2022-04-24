
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Experiencia;
import com.backEndSpringBoot.Spring.Boot.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService {
    
    @Autowired
    ExperienciaRepository experienciaRepo;
    
    public List<Experiencia> listarExperienciaPorIdPersona(Long idPersona){
        return  experienciaRepo.findByIdPersona(idPersona);
    }
    
    public void crearExperiencia(Experiencia experiencia){
        
          experienciaRepo.save(experiencia);
        
    }
    
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
    public void modificarExperiencia(Experiencia experiencia){
        experienciaRepo.save(experiencia);
    }
    
    
    
    }
