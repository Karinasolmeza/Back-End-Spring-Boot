
package com.backEndSpringBoot.Spring.Boot.Controller;

import com.backEndSpringBoot.Spring.Boot.Model.Contact;
import com.backEndSpringBoot.Spring.Boot.Service.ContactService;
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
public class ContactoController {
    @Autowired
    ContactService contactService;
    
    @GetMapping("/contact/{id}")
    @ResponseBody
    public Contact obtenerContact(@PathVariable Long id){
        return contactService.obtenerContact(id);
    }
      
 // @GetMapping("/contact/{idPersona}") 
  //@ResponseBody
   //public Contact obtenerContact(@PathVariable Long idPersona){
     //   return contactService.obtenerContact(idPersona);
    //}
    
    @PostMapping("/contact")
    public void crearContact(@RequestBody Contact contact){
        contactService.crearContact(contact);
    }
    
    @DeleteMapping("/contact/{id}")
    public void borrarContact(@PathVariable Long id){
        contactService.borrarContact(id);
    }
    
    
    @PutMapping ("/contact")
    public void modificarContact (@RequestBody Contact contact){
        contactService.ModificarContact(contact);
    }
    
    
    
}
