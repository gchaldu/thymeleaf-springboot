package net.youtics.springboot.webapp.springbootweb.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.youtics.springboot.webapp.springbootweb.models.User;
import net.youtics.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {


   /*  @GetMapping("/details")
    public Map<String, Object> details(){

        User user = new User("gchaldu", "gabriel@gmail.com");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Datos del Usuario");
        body.put("username", user);
        return body;
    } */

    @GetMapping("/details")
    public UserDto details(){

        User user = new User("Matt4", "Cuerdas", "matt", "matt@mdp.com");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Perfil de usuario");
       
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list (){
        User u1 = new User("YouTics", "Canal" ,"youtics@mdp.com", "youtics");
        User u2 = new User("Pep", "Bondiola", "pep@mdp.com", "pep");
        User u3 = new User("Matt4", "Cuerdas", "matt@mdp.com", "matt");

        List<User> listadoUser = new ArrayList<>();

        listadoUser.add(u1);
        listadoUser.add(u2);
        listadoUser.add(u3);

        return listadoUser;
    }

    @GetMapping("/list2")
    public List<User> list2 (){
        User u1 = new User("YouTics", "Canal" ,"youtics", "youtics@mdp.com");
        User u2 = new User("Pep", "Bondiola", "pep", "pep@mdp.com");
        User u3 = new User("Matt4", "Cuerdas", "matt", "matt@mdp.com");


        List<User> listadoUser = Arrays.asList(u1,u2,u3);

        return listadoUser;
    }

}
