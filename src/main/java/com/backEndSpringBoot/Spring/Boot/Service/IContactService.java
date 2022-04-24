
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Contact;


public interface IContactService {
    public void crearContact (Contact contact);
    public void borrarContact (Long id);
    public void modificarContact (Contact contact);
    
    
}
