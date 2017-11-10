package pl.malkowicz.thesis.engine.thesisengine.Service.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.malkowicz.thesis.engine.thesisengine.Dto.MessageDto;
import pl.malkowicz.thesis.engine.thesisengine.Provider.MessageProvider;
import pl.malkowicz.thesis.engine.thesisengine.Service.MessageService;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageProvider provider;

    @Override
    public MessageDto createMessage(MessageDto messageDto) {
        return provider.createMessage(messageDto);
    }

    @Override
    public MessageDto getMessage(Long id) {
        return provider.getMessage(id);
    }

    @Override
    public MessageDto updateMessage(Long id, MessageDto messageDto) {
        return provider.updateMessage(id,messageDto);
    }

    @Override
    public void deleteMessage(Long id) {
        provider.deleteMessage(id);
    }

    @Override
    public List<MessageDto> getMessageBySessionId(Long sessionid) {
        return provider.getMessageBySessionId(sessionid);
    }

    @Override
    public List<MessageDto> getMessageBySenderId(Long senderId) {
        return provider.getMessageBySenderId(senderId);
    }
}
