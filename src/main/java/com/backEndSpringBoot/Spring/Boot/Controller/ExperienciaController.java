
package com.backEndSpringBoot.Spring.Boot.Controller;

import com.backEndSpringBoot.Spring.Boot.Model.Experiencia;
import com.backEndSpringBoot.Spring.Boot.Service.ExperienciaService;
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

@CrossOrigin (origins = {"https://portfolio-karinameza.web.app/"}, allowedHeaders = "*")
@RestController
public class ExperienciaController {
    @Autowired
    ExperienciaService experienciaService;
    
    
    @GetMapping("/experiencia")
    @ResponseBody
      public List<Experiencia>ListarExperiencias(){
        return experienciaService.ListarExperiencias();
    }
    
   // public List<Experiencia> listarExperienciaPorIdPersona(@PathVariable Long IdPersona){
     //   return experienciaService.listarExperienciaPorIdPersona(IdPersona);
    //}
    
    @PostMapping("/experiencia")
    public void crearExperiencia (@RequestBody Experiencia experiencia){
        experienciaService.crearExperiencia(experiencia);
        
       }
   
    @DeleteMapping ("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaService.borrarExperiencia(id);
    }
    
    @PutMapping ("/experiencia/{id}")
    public void modificarExperiencia (@RequestBody Experiencia experiencia){
        experienciaService.modificarExperiencia(experiencia);
}
    
    
   
}
