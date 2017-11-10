package pl.malkowicz.thesis.engine.thesisengine.Domain.Listener;

import org.springframework.stereotype.Component;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Base.BaseEntity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Component
public class ThesisFiledEntityListener {

    @PrePersist
    public void touchForCreate(BaseEntity target){
        target.setTimeCreate(new Date());
    }

    @PreUpdate
    public void touchForUpdate(BaseEntity target){
        target.setLastUpdated(new Date());
    }
}
