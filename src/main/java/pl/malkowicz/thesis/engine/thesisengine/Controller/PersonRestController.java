package pl.malkowicz.thesis.engine.thesisengine.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.malkowicz.thesis.engine.thesisengine.Dto.PersonDto;
import pl.malkowicz.thesis.engine.thesisengine.Service.PersonService;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@RestController
@RequestMapping("/person")
public class PersonRestController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<PersonDto> getAllPersons() {
        return personService.getAllPersons();
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public PersonDto createPerson(@RequestBody PersonDto personDto) {
        return personService.createPerson(personDto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PersonDto getPerson(@PathVariable("id") Long id){
        return personService.getPerson(id);
    }
}
