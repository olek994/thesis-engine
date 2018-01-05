package pl.malkowicz.thesis.engine.thesisengine.Dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.malkowicz.thesis.engine.thesisengine.Dto.Base.BaseDto;

import java.util.List;

/**
 * Created by Aleksander on 04.01.2018.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ConversationDto extends BaseDto<Long> {


    Long firstInterlocutorId;

    Long secondInterlocutorId;


    public ConversationDto(Long id, Long firstInterlocutorId, Long secondInterlocutorId) {
        super(id);
        this.firstInterlocutorId = firstInterlocutorId;
        this.secondInterlocutorId = secondInterlocutorId;
    }
}
