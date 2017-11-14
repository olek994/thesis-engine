package pl.malkowicz.thesis.engine.thesisengine.Dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.malkowicz.thesis.engine.thesisengine.Dto.Base.BaseDto;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class UserDto extends BaseDto<Long> {

    @NotNull
    private String name;

    @NotNull
    private String subname;

    @NotNull
    private String email;

    @NotNull
    private String password;

    private List<Long> recipientId;

    @Builder
    public UserDto(Long id, String name, String subname, List<Long> recipientId){
        super(id);
        this.name = name;
        this.subname = subname;
        this.recipientId = recipientId;
    }

}
