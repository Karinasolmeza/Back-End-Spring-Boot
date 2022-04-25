
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Skills;
import com.backEndSpringBoot.Spring.Boot.Repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {
    @Autowired
    SkillsRepository skillsRepo;
    
    
    public List<Skills> listarSkills(){
        return skillsRepo.findAll();
    }
    //public List<Skills> listarSkillsPorIdPersona(Long idPersona){
      //  return skillsRepo.findByIdPersona(idPersona);
    //}
    
    public void crearSkills(Skills skills){
        skillsRepo.save(skills);
        
    }
    
    public void borrarSkills(Long id){
        skillsRepo.deleteById(id);
    }
    
    public void modificarSkills (Skills skills){
        skillsRepo.save(skills);
        
    }
}
