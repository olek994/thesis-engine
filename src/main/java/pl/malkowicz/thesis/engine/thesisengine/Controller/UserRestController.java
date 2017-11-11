package pl.malkowicz.thesis.engine.thesisengine.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.malkowicz.thesis.engine.thesisengine.Dto.UserDto;
import pl.malkowicz.thesis.engine.thesisengine.Service.UserService;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    UserService UserService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<UserDto> getAllUsers() {
        return UserService.getAllUsers();
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public UserDto createUser(@RequestBody UserDto userDto) {
        System.out.println(userDto);
        return UserService.createUser(userDto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public UserDto getUser(@PathVariable("id") Long id){
        return UserService.getUser(id);
    }

    @RequestMapping(value="/signin/{email}/{password}",method = RequestMethod.GET)
    public UserDto findByEmailAndPassword(@PathVariable("email") String email, @PathVariable("password") String password){
        return UserService.findByEmailAndPassword(email,password);
    }
}
