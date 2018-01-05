package pl.malkowicz.thesis.engine.thesisengine.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Message;
import pl.malkowicz.thesis.engine.thesisengine.Dto.MessageDto;
import pl.malkowicz.thesis.engine.thesisengine.Service.MessageService;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@RestController
@RequestMapping("/message")
public class MessageRestController {

    @Autowired
    MessageService service;

    @RequestMapping(value="/",method = RequestMethod.POST)
    public MessageDto createMessage(@RequestBody MessageDto messageDto) {
        return service.createMessage(messageDto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public MessageDto getMessage(@PathVariable("id") Long id) {
        return service.getMessage(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public MessageDto updateMessage(@PathVariable("id")Long id, @RequestBody MessageDto messageDto) {
        return service.updateMessage(id,messageDto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteMessage(@PathVariable("id")Long id) {
            service.deleteMessage(id);
    }

    @RequestMapping(value = "/author/{authorId}", method = RequestMethod.GET)
    public List<MessageDto> getMessageByAuthorId(@PathVariable("authorId") Long authorId){
        return service.getMessageByAuthorId(authorId);
    }


    @RequestMapping(value = "/conversation/{conversationId}", method = RequestMethod.GET)
    public List<MessageDto> getAllMessagesByConversationId(@PathVariable("conversationId") Long conversationId){
        return service.findAllByConversationId(conversationId);
    }

}
