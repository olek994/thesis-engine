package pl.malkowicz.thesis.engine.thesisengine.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.malkowicz.thesis.engine.thesisengine.Dto.ConversationDto;
import pl.malkowicz.thesis.engine.thesisengine.Service.ConversationService;

import java.util.List;

/**
 * Created by Aleksander on 05.01.2018.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@RestController
@RequestMapping("/conversation")
public class ConversationRestController {

    @Autowired
    ConversationService service;


    @RequestMapping(value="/",method = RequestMethod.POST)
    public ConversationDto createConversation(ConversationDto conversationDto){
        return service.createConversation(conversationDto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ConversationDto getConversation(@PathVariable("id") Long id){
        return service.getConversation(id);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ConversationDto updateConversation(@PathVariable("id") Long id, @RequestBody ConversationDto conversationDto){
        return service.updateConversation(id,conversationDto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteConversation(@PathVariable("id") Long id){
        service.deleteConversation(id);
    }

    @RequestMapping(value ="/first/{firstInterlocutorId}/second/{secondInterlocutorId}",method = RequestMethod.GET)
    public ConversationDto getByFirstInterlocutorIdAndSecondInterlocutorId(@PathVariable("firstInterlocutorId")Long firstInterlocutorId, @PathVariable("secondInterlocutorId") Long secondInterlocutorId){
        return service.findByFirstInterlocutorIdAndSecondInterlocutorId(firstInterlocutorId, secondInterlocutorId);
    }

}
