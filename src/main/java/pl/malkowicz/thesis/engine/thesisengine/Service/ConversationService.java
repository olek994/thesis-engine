package pl.malkowicz.thesis.engine.thesisengine.Service;

import pl.malkowicz.thesis.engine.thesisengine.Dto.ConversationDto;

import java.util.List;

/**
 * Created by Aleksander on 05.01.2018.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public interface ConversationService  {

    public ConversationDto createConversation(ConversationDto conversationDto);


    public ConversationDto getConversation(Long id);


    public ConversationDto updateConversation(Long id,  ConversationDto conversationDto);


    public void deleteConversation(Long id);

    public ConversationDto findByFirstInterlocutorIdAndSecondInterlocutorId(Long firstInterlocutroId, Long secondInterlocutorId);

}
