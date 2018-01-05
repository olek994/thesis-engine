package pl.malkowicz.thesis.engine.thesisengine.Domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "t_MESSAGE")
@SequenceGenerator(name = "sMessage",
                   sequenceName = "SEQ_MESSAGE",
                   allocationSize = 1,
                   initialValue = 100)
public class Message extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "sMessage")
    @Id
    Long id;

    @Column
    Long authorId;

    @Column
    Long conversationId;

    @Column
    String content;

    @Column
    Date sendDate;

}
