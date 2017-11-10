package pl.malkowicz.thesis.engine.thesisengine.Service.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.malkowicz.thesis.engine.thesisengine.Dto.PersonDto;
import pl.malkowicz.thesis.engine.thesisengine.Provider.PersonProvider;
import pl.malkowicz.thesis.engine.thesisengine.Service.PersonService;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonProvider personProvider;

    @Override
    public List<PersonDto> getAllPersons() {
        return personProvider.getAllPersons();
    }

    @Override
    public PersonDto createPerson(PersonDto personDto) {
        return personProvider.createPerson(personDto);
    }

    @Override
    public PersonDto getPerson(Long id) {
        return personProvider.getPerson(id);
    }
}
