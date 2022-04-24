
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.AboutMe;


public interface IAboutMeService {
    public void crearAboutMe (AboutMe aboutMe);
    public void borrarAboutMe (Long id);
    public void modificarAboutMe (AboutMe aboutMe);
    

    
}



