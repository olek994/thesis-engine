package pl.malkowicz.thesis.engine.thesisengine.Service.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.malkowicz.thesis.engine.thesisengine.Dto.ConversationDto;
import pl.malkowicz.thesis.engine.thesisengine.Provider.ConversationProvider;
import pl.malkowicz.thesis.engine.thesisengine.Service.ConversationService;

import java.util.List;

/**
 * Created by Aleksander on 05.01.2018.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Service
@Slf4j
public class ConversationServiceImpl implements ConversationService {

    @Autowired
    ConversationProvider provider;

    @Override
    public ConversationDto createConversation(ConversationDto conversationDto) {
        return provider.createConversation(conversationDto);
    }

    @Override
    public ConversationDto getConversation(Long id) {
        return provider.getConversation(id);
    }

    @Override
    public ConversationDto updateConversation(Long id, ConversationDto conversationDto) {
        return provider.updateConversation(id,conversationDto);
    }

    @Override
    public void deleteConversation(Long id) {
        provider.deleteConversation(id);
    }

    @Override
    public ConversationDto findByFirstInterlocutorIdAndSecondInterlocutorId(Long firstInterlocutroId, Long secondInterlocutorId) {
        return provider.findByFirstInterlocutorIdAndSecondInterlocutorId(firstInterlocutroId,secondInterlocutorId);
    }

}
