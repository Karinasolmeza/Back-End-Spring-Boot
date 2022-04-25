
package com.backEndSpringBoot.Spring.Boot.Service;
import com.backEndSpringBoot.Spring.Boot.Model.Educacion;
import com.backEndSpringBoot.Spring.Boot.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService  {

    @Autowired
    EducacionRepository eduRepo;
    public List<Educacion> ListarEducacion(){
    return eduRepo.findAll();
    }
  
    //public  List <Educacion> ListarEducacionPorIdPersona(Long idPersona){
    //return eduRepo.findByIdPersona(idPersona);
   //}
  
    
    public void borrarEducacion(Long id){
 
    eduRepo.deleteById(id);

    }
            
    public void crearEducacion (Educacion educacion){
     eduRepo.save(educacion);
    }
    
 
    
     public void modificarEducacion (Educacion educacion){
        eduRepo.save(educacion);
     }
     
     
            }


