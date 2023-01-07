
package com.backEndSpringBoot.Spring.Boot.Controller;

import com.backEndSpringBoot.Spring.Boot.Model.Usuario;
import com.backEndSpringBoot.Spring.Boot.Model.dto.UserDto;
import com.backEndSpringBoot.Spring.Boot.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin (origins = {"https://portfolio-karinameza.web.app/"}, allowedHeaders = "*")
@RestController
public class AuthController {
    
    @Autowired
    AuthService service;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    }
    
    
    //desactivar registros luego 
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception {
       service.crearUsuario(usuario);
    }
}
