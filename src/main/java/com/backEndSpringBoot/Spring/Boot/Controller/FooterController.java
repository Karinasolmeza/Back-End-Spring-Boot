
package com.backEndSpringBoot.Spring.Boot.Controller;

import com.backEndSpringBoot.Spring.Boot.Model.Footer;
import com.backEndSpringBoot.Spring.Boot.Service.FooterService;
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
public class FooterController {
     @Autowired
    FooterService footerService;
     
  
    
    @GetMapping("/footer")
    @ResponseBody
    public List<Footer> listarFooter(){
        return footerService.listarFooter();
    }
    
    // public List<Footer> listarFooterPorIdPersona(@PathVariable Long idPersona){
     // return footerService.listarFooterPorIdPersona(idPersona);
    //}
     @PostMapping("/footer")
     public void crearFooter(@RequestBody Footer footer){
        footerService.crearFooter(footer);
     }
    
        @DeleteMapping ("/footer/{id}")
     public void borrarFooter(@PathVariable Long id){
         footerService.borrarFooter(id);
     }
     @PutMapping ("/footer/{id}")
     public void modificarFooter(@RequestBody Footer footer){
        footerService.modificarFooter(footer);
          }
    
}
