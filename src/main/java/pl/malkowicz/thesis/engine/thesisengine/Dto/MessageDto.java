package pl.malkowicz.thesis.engine.thesisengine.Dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.malkowicz.thesis.engine.thesisengine.Dto.Base.BaseDto;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class MessageDto extends BaseDto<Long> {

    Long authorId;

    Long conversationId;

    Date sendDate;

    String content;

    @Builder
    public MessageDto(Long id, Long authorId,Long conversationId,Date sendDate, String content){
        super(id);
        this.authorId = authorId;
        this.conversationId = conversationId;
        this.sendDate = sendDate;
        this.content = content;
    }
}
