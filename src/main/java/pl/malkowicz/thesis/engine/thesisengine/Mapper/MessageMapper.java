package pl.malkowicz.thesis.engine.thesisengine.Mapper;

import ma.glasnost.orika.MapperFactory;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Message;
import pl.malkowicz.thesis.engine.thesisengine.Dto.MessageDto;
import pl.malkowicz.thesis.engine.thesisengine.Mapper.Base.MapperConfig;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public class MessageMapper implements MapperConfig {
    @Override
    public void configure(MapperFactory factory) {
        factory.classMap(Message.class, MessageDto.class)
                .byDefault().register();
    }
}
