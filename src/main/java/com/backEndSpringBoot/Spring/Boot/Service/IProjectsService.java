
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Projects;
import java.util.List;

public interface IProjectsService {
     public void crearProjects (Projects projects);
    public void borrarProjects (Long id);
    public void modificatProjects (Projects projects);
    public List<Projects> listarProjects();
}
