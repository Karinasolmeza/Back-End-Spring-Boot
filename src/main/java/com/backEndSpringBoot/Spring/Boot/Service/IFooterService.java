
package com.backEndSpringBoot.Spring.Boot.Service;

import com.backEndSpringBoot.Spring.Boot.Model.Footer;
import java.util.List;


public interface IFooterService {
      public void crearFooter (Footer footer);
    public void borrarFooter (Long id);
    public void modificatFooter (Footer footer);
    public List<Footer> listarFooter();
}
