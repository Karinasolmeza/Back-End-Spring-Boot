package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.AboutMe;
import com.backEndSpringBoot.Spring.Boot.Repository.AboutMeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutMeService {
    
@Autowired
AboutMeRepository aboutMeRepo;

     
    public AboutMe obtenerAboutMe(Long idPersona) {
     return aboutMeRepo.findByIdPersona(idPersona);
       
    }
    
   
    public void crearAboutMe(AboutMe  aboutMe ) {
        aboutMeRepo.save(aboutMe);
    }

    public void borrarAboutMe(Long id) {
        aboutMeRepo.deleteById(id);
    }

 
  
    public void modificarAboutMe (AboutMe aboutMe){
        aboutMeRepo.save(aboutMe);
        
        
    }

   
    
}





