package pl.malkowicz.thesis.engine.thesisengine.Service;


import pl.malkowicz.thesis.engine.thesisengine.Dto.MessageDto;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public interface MessageService {

    MessageDto createMessage(MessageDto messageDto);


    MessageDto getMessage(Long id);


    MessageDto updateMessage(Long id, MessageDto messageDto);


    void deleteMessage(Long id);


    List<MessageDto> getMessageBySessionId(Long sessionid);


    List<MessageDto> getMessageBySenderId(Long senderId);
}
