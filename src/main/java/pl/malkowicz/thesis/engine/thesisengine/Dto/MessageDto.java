package pl.malkowicz.thesis.engine.thesisengine.Dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.malkowicz.thesis.engine.thesisengine.Dto.Base.BaseDto;

import javax.validation.constraints.NotNull;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class MessageDto extends BaseDto<Long> {

    @NotNull
    PersonDto sender;

    @NotNull
    PersonDto reciver;

    @NotNull
    Long sessionId;

    String content;

    @Builder
    public MessageDto(Long id, PersonDto sender, PersonDto reciver, Long sessionId, String content){
        super(id);
        this.sender = sender;
        this.reciver = reciver;
        this.sessionId = sessionId;
        this.content = content;
    }
}
