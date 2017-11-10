package pl.malkowicz.thesis.engine.thesisengine.Mapper;

import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Person;
import pl.malkowicz.thesis.engine.thesisengine.Dto.PersonDto;
import pl.malkowicz.thesis.engine.thesisengine.Mapper.Base.MapperConfig;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Component
public class PersonMapper implements MapperConfig {
    @Override
    public void configure(MapperFactory factory) {
        factory.classMap(Person.class, PersonDto.class)
                .byDefault().register();
    }
}
