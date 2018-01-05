package pl.malkowicz.thesis.engine.thesisengine.Domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Aleksander on 04.01.2018.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "t_CONVERSATION")
@SequenceGenerator(name = "sConversation",
                   sequenceName = "SEQ_CONVERSATION",
                   allocationSize = 1,
                   initialValue = 100)
public class Conversation extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "sConversation")
    @Id
    Long id;


    @Column
    Long firstInterlocutorId;

    @Column
    Long secondInterlocutorId;
}
