
package com.backEndSpringBoot.Spring.Boot.Controller;

import com.backEndSpringBoot.Spring.Boot.Model.Skills;
import com.backEndSpringBoot.Spring.Boot.Service.SkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin (origins = {"http://localhost:4200/"})
@RestController
public class SkillsController {
    @Autowired
    SkillsService skillsService;
    
    @GetMapping("/skills/{idPersona}")
    @ResponseBody
    public List<Skills> ListarSkillsPorIdPersona(@PathVariable Long idPersona){
        return skillsService.listarSkillsPorIdPersona(idPersona);
    }
    
    @PostMapping("/skills")
    public  void  crearSkills(@RequestBody Skills skills){
        skillsService.crearSkills(skills);
    }
    
    @DeleteMapping ("/skills/{id}")
    public void  borrarSkills (@PathVariable Long id){
        skillsService.borrarSkills(id);
    }
    
    @PutMapping("/skills")
    public void modificarSkills (@RequestBody Skills skills){
        skillsService.modificarSkills(skills);
    }
    
    
    
    
    
}
