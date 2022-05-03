
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Footer;
import com.backEndSpringBoot.Spring.Boot.Repository.FooterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FooterService {
    @Autowired
    FooterRepository footerRepo;
    
    public List<Footer> listarFooter(){
        return footerRepo.findAll();
    }
    
      public void crearFooter(Footer footer){
        footerRepo.save(footer);
    }
       public void borrarFooter(Long id){
        footerRepo.deleteById(id);
    }
    
       public void modificarFooter(Footer footer){
    footerRepo.save(footer);
}

}



