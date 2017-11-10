package pl.malkowicz.thesis.engine.thesisengine.Service;

import pl.malkowicz.thesis.engine.thesisengine.Dto.PersonDto;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public interface PersonService  {

    List<PersonDto> getAllPersons();

    PersonDto createPerson(PersonDto personDto);

    PersonDto getPerson(Long id);
}
