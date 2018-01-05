package pl.malkowicz.thesis.engine.thesisengine.Mapper;

import ma.glasnost.orika.MapperFactory;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Conversation;
import pl.malkowicz.thesis.engine.thesisengine.Dto.ConversationDto;
import pl.malkowicz.thesis.engine.thesisengine.Mapper.Base.MapperConfig;

/**
 * Created by Aleksander on 05.01.2018.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public class ConversationMapper implements MapperConfig {
    @Override
    public void configure(MapperFactory factory) {
        factory.classMap(Conversation.class, ConversationDto.class)
                .byDefault()
                .register();
    }
}
