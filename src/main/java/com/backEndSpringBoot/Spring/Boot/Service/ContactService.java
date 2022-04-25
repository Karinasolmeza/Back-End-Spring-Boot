
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Contact;
import com.backEndSpringBoot.Spring.Boot.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepo;
    
    public Contact obtenerContact(Long id){
       return contactRepo.findById(id).orElse (null);
    }
    
      //public Contact ObtenerContact(Long idPersona) {
     //return contactRepo.findByIdPersona(idPersona);
       //}
    
    public void crearContact(Contact contact){
        contactRepo.save(contact);
    }
    
    public void borrarContact (Long id){
        contactRepo.deleteById(id);
    }
    
    public void ModificarContact(Contact contact){
        contactRepo.save(contact);
    }
}
