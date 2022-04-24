
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Skills;
import java.util.List;


public interface ISkillsService {
    public void crearSkills (Skills skills);
    public void borrarSkills (Long id);
    public void modificarSkills (Skills skills);
    public List<Skills> listarSkills();

}
