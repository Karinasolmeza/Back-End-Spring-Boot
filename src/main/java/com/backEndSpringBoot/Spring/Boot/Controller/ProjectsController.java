
package com.backEndSpringBoot.Spring.Boot.Controller;

import com.backEndSpringBoot.Spring.Boot.Model.Projects;
import com.backEndSpringBoot.Spring.Boot.Service.ProjectsService;
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


@CrossOrigin (origins = {"http://localhost:4200/"})
@RestController
public class ProjectsController {
    @Autowired
    ProjectsService projectsService;
    
    @GetMapping("/projects/{idPersona}")
    @ResponseBody
    public List<Projects> listarProjectsPorIdPersona(@PathVariable Long idPersona){
      return projectsService.listarProjectsPorIdPersona(idPersona);
    }
     @PostMapping("/projects")
     public void crearProjects(@RequestBody Projects projects){
         projectsService.crearProjects(projects);
     }
     
     @DeleteMapping ("/projects/{id}")
     public void borrarProjects(@PathVariable Long id){
         projectsService.borrarProjects(id);
     }
     @PutMapping ("/projects")
     public void modificarProjects(@RequestBody Projects projects){
         projectsService.modificarProjects(projects);
          }
     
    
}
