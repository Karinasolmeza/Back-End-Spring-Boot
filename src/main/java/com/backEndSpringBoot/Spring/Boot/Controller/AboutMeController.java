
package com.backEndSpringBoot.Spring.Boot.Controller;


import com.backEndSpringBoot.Spring.Boot.Model.AboutMe;
import com.backEndSpringBoot.Spring.Boot.Service.AboutMeService;
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
    public class AboutMeController {
    @Autowired
    AboutMeService aboutMeService;                                                                                                                                                                                                                                                                                                        
    
         
    
  @GetMapping("/aboutme/{idPersona}") 
  @ResponseBody
   public AboutMe obtenerAboutMe(@PathVariable Long idPersona){
        return aboutMeService.obtenerAboutMe(idPersona);
    }
    

    
  @PostMapping("/aboutme")
      public void crearAboutMe(@RequestBody AboutMe aboutMe){
          aboutMeService.crearAboutMe(aboutMe);
      }
      
   
   @DeleteMapping("/aboutme/{id}")
   public void borrarAboutMe(@PathVariable Long id){
   aboutMeService.borrarAboutMe(id);
   }
 
   
 
      
    @PutMapping ("/aboutme")
       public void modificarAboutMe (@RequestBody AboutMe aboutMe){
        aboutMeService.modificarAboutMe(aboutMe);
    }
    
    
    }


        

