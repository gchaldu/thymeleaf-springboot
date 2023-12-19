package net.youtics.springboot.webapp.springbootweb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.youtics.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {


    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Gabriel", "Chaldu" ,"gabriel@gmail.com", "gchaldu");
        model.addAttribute("title", "Datos del Usuario");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list( Model model){
        User u1 = new User("YouTics", "Canal" ,"youtics@mdp.com", "youtics");
        User u2 = new User("Pep", "Bondiola", "pep@mdp.com", "pep");
        User u3 = new User("Matt4", "Cuerdas", "matt@mdp.com", "matt");

        List<User> lista = Arrays.asList(u1,u2,u3);

        model.addAttribute("lista", lista);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

}
