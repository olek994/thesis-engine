package pl.malkowicz.thesis.engine.thesisengine.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Message;
import pl.malkowicz.thesis.engine.thesisengine.Dto.MessageDto;
import pl.malkowicz.thesis.engine.thesisengine.Provider.Base.BaseCrudProvider;
import pl.malkowicz.thesis.engine.thesisengine.Repository.MessageRepository;
import pl.malkowicz.thesis.engine.thesisengine.Repository.UserRepository;


import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Component
public class MessageProvider extends BaseCrudProvider<Message, MessageDto> {


    @Autowired
    MessageRepository repo;

    @Autowired
    UserRepository UserRepository;


    public MessageDto createMessage(MessageDto messageDto) {
        return convert(repo.save(this.convertToEntity(messageDto,null)));
    }


    public MessageDto getMessage(Long id) {
        return convert(repo.getOne(id));
    }


    public MessageDto updateMessage(Long id,  MessageDto messageDto) {
        return convert(repo.save(convertToEntity(messageDto,repo.getOne(id))));
    }


    public void deleteMessage(Long id) {
        repo.delete(id);
    }

    public List<MessageDto> findAllByAuthorId(Long authorId){
        return convert(repo.findAllByAuthorId(authorId));
    }

    public List<MessageDto> findAllByConversationId(Long conversationId){
        return convert(repo.findAllByConversationId(conversationId));
    }

    @Override
    protected Message convertToEntity(MessageDto dto, Message entity) {
        if (entity == null) {
            entity = new Message();
        }
        entity.setAuthorId(dto.getAuthorId());
        entity.setConversationId(dto.getConversationId());
        entity.setSendDate(dto.getSendDate());
        entity.setContent(dto.getContent());

        return entity;
    }
}
