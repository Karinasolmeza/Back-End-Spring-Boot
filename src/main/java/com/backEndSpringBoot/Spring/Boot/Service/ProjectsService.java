
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Projects;
import com.backEndSpringBoot.Spring.Boot.Repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ProjectsService {
    @Autowired
    ProjectsRepository projectsRepo;
    public  List<Projects> listarProjects(){
        return projectsRepo.findAll();
    }
    
    //public  List<Projects> listarProjectsPorIdPersona(Long idPersona){
      //  return projectsRepo.findByIdPersona(idPersona);
    //}
    
    
    public void crearProjects(Projects projects){
        projectsRepo.save(projects);
    }
    
    
    public void borrarProjects(Long id){
        projectsRepo.deleteById(id);
    }

public void modificarProjects(Projects projects){
    projectsRepo.save(projects);
}



}



