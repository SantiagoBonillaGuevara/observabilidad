package disenoYArquitecura.obserbabilidad.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import disenoYArquitecura.obserbabilidad.entities.user;
import disenoYArquitecura.obserbabilidad.services.userService;

@RestController
public class controlUser {

    
    userService us1;

    public controlUser(userService us1)
    {
        this.us1= us1;
    }

    @GetMapping("/users")
    public List<user> users()
    {
        return this.us1.getRepositorio();
    }

}
