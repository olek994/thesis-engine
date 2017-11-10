package pl.malkowicz.thesis.engine.thesisengine.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Person;
import pl.malkowicz.thesis.engine.thesisengine.Dto.PersonDto;
import pl.malkowicz.thesis.engine.thesisengine.Provider.Base.BaseCrudProvider;
import pl.malkowicz.thesis.engine.thesisengine.Repository.PersonRepository;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Component
public class PersonProvider extends BaseCrudProvider<Person, PersonDto> {

    @Autowired
    PersonRepository personRepository;

    public List<PersonDto> getAllPersons(){
        return convert(personRepository.findAll());
    }

    public PersonDto createPerson(PersonDto personDto){
        return convert(personRepository.save(convertToEntity(personDto,null)));
    }

    public PersonDto getPerson(Long id){
        return convert(personRepository.getOne(id));
    }

    @Override
    protected Person convertToEntity(PersonDto dto, Person entity) {
        if(entity == null){
            entity = new Person();
        }
        entity.setName(dto.getName());
        entity.setSubname(dto.getSubname());

        return entity;
    }
}
