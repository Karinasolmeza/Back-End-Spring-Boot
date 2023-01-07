
package com.backEndSpringBoot.Spring.Boot.Controller;

import com.backEndSpringBoot.Spring.Boot.Model.Educacion;
import com.backEndSpringBoot.Spring.Boot.Service.EducacionService;
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
public class EducacionController {
 
    @Autowired
    EducacionService eduService;
   // int idPersona=1;
  
    //*@GetMapping("/educacion/{idPersona}")
   // @ResponseBody
    //public List<Educacion> listarEducacionPorIdPersona(@PathVariable Long idPersona){
      //  return eduService.ListarEducacionPorIdPersona(idPersona);
    //}
    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion>ListarEducacion(){
        return eduService.ListarEducacion();
    }
    
    
  @DeleteMapping("/educacion/{id}")
  public void eliminarEducacion(@PathVariable Long id){
          eduService.borrarEducacion(id);
          }
  
  @PostMapping("/educacion")
  public void crearEducacion(@RequestBody Educacion educacion){
   eduService.crearEducacion(educacion);
  }
  
 
 
   @PutMapping("/educacion/{id}")
   public void modificarEducacion(@RequestBody Educacion educacion){
      eduService.modificarEducacion (educacion);
   }
}

   
	




	