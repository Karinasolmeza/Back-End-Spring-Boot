
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Educacion;
import java.util.List;


public interface IEducacionService {
    public void crearEducacion (Educacion educacion);
    public void borrarEducacion (Long id);
    public void modificarEducacion (Educacion educacion);
    public  List<Educacion> listarEducacion();
    
}
