package pl.malkowicz.thesis.engine.thesisengine.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Conversation;
import pl.malkowicz.thesis.engine.thesisengine.Dto.ConversationDto;
import pl.malkowicz.thesis.engine.thesisengine.Provider.Base.BaseCrudProvider;
import pl.malkowicz.thesis.engine.thesisengine.Repository.ConversationRepository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Aleksander on 05.01.2018.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Component
public class ConversationProvider extends BaseCrudProvider<Conversation,ConversationDto> {


    @Autowired
    ConversationRepository repo;

    public ConversationDto createConversation(ConversationDto conversationDto) {
        return convert(repo.save(this.convertToEntity(conversationDto,null)));
    }


    public ConversationDto getConversation(Long id) {
        return convert(repo.getOne(id));
    }


    public ConversationDto updateConversation(Long id,  ConversationDto conversationDto) {
        return convert(repo.save(convertToEntity(conversationDto,repo.getOne(id))));
    }


    public void deleteConversation(Long id) {
        repo.delete(id);
    }

    public ConversationDto findByFirstInterlocutorIdAndSecondInterlocutorId(Long firstInterlocutroId, Long secondInterlocutorId){
        return convert(repo.findByFirstInterlocutorIdAndSecondInterlocutorId(firstInterlocutroId,secondInterlocutorId));
    }


    @Override
    protected Conversation convertToEntity(ConversationDto dto, Conversation entity) {
        if (entity == null) {
            entity = new Conversation();
        }
        entity.setFirstInterlocutorId(dto.getFirstInterlocutorId());
        entity.setSecondInterlocutorId(dto.getSecondInterlocutorId());

        return entity;
    }
}
