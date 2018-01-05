package pl.malkowicz.thesis.engine.thesisengine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Conversation;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Aleksander on 05.01.2018.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public interface ConversationRepository extends JpaRepository<Conversation,Long> {

    public Conversation findByFirstInterlocutorIdAndSecondInterlocutorId(Long firstInterlocutroId, Long secondInterlocutorId);

}
