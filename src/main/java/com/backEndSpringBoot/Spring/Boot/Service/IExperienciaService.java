
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public void crearExperiencia (Experiencia experiencia);
    public void borrarExperiencia (Long id);
    public void modificatExperiencia (Experiencia experiencia);
    public List<Experiencia> listarExperiencias();
}
