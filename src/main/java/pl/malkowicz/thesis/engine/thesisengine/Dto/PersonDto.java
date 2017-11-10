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
public class PersonDto extends BaseDto<Long> {

    @NotNull
    private String name;

    @NotNull
    private String subname;

    @Builder
    public PersonDto(Long id, String name, String subname){
        super(id);
        this.name = name;
        this.subname = subname;
    }

}
