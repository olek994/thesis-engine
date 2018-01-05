package pl.malkowicz.thesis.engine.thesisengine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Message;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findAllByAuthorId(Long authorId);

    List<Message> findAllByConversationId(Long conversationId);
}
