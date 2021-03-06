package pl.malkowicz.thesis.engine.thesisengine.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "t_PERSON")
@SequenceGenerator(name = "sPerson",
                   sequenceName = "SEQ_PERSON",
                   allocationSize = 1,
                   initialValue = 100)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "sPerson")
    @Id
    Long id;

    @Column
    String name;

    @Column
    String subname;


}
