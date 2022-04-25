
package com.backEndSpringBoot.Spring.Boot.Repository;

import com.backEndSpringBoot.Spring.Boot.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
    //public Contact findByIdPersona(Long idPersona);
    
}
