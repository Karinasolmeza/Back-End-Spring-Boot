
package com.backEndSpringBoot.Spring.Boot.Controller;

import com.backEndSpringBoot.Spring.Boot.Model.Persona;
import com.backEndSpringBoot.Spring.Boot.Service.PersonaService;
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
        
@CrossOrigin(origins = {"https://portfolio-karinameza.web.app/"}, allowedHeaders = "*")
@RestController
    public class PersonaController {
    @Autowired
    PersonaService personaService;
         
  @GetMapping("/persona") 
  @ResponseBody
   public List<Persona> listarPersonas(){
        return personaService.listarPersonas();
    }
    
  
    
    @PostMapping("/persona")
      public void crearPersona(@RequestBody Persona persona){
          personaService.crearPersona(persona);
      }
   
   @DeleteMapping("/persona/{id}")
   public void borrarPersona(@PathVariable Long id){
   personaService.borrarPersona(id);
   }
   
   @GetMapping("/persona/{id}")
   @ResponseBody
   public Persona obtenerPersona(@PathVariable Long id){
 return personaService.obtenerPersona(id);
        
   }
   
   @PutMapping("/persona")
   public void modificarPersona(@RequestBody Persona persona){
       personaService.modificarPersona(persona);
   }
   
  
    }

        

