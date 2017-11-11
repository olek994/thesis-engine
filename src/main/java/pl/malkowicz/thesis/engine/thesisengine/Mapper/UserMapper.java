package pl.malkowicz.thesis.engine.thesisengine.Mapper;

import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;
import pl.malkowicz.thesis.engine.thesisengine.Domain.User;
import pl.malkowicz.thesis.engine.thesisengine.Dto.UserDto;
import pl.malkowicz.thesis.engine.thesisengine.Mapper.Base.MapperConfig;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Component
public class UserMapper implements MapperConfig {
    @Override
    public void configure(MapperFactory factory) {
        factory.classMap(User.class, UserDto.class)
                .byDefault().register();
    }
}
