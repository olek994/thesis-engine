package pl.malkowicz.thesis.engine.thesisengine.Domain.Base;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Listener.ThesisFiledEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Data
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class, ThesisFiledEntityListener.class})
public class BaseEntity implements Serializable {
    @CreatedBy
    @Column(name = "USER_CREATE")
    private String userCreate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_CREATE")
    private Date timeCreate;


    @LastModifiedBy
    @Column(name = "USER_UPDATE")
    private String userUpdate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_TIME_UPDATE")
    private Date lastUpdated;

    @Column(name = "ACTIVE", length = 1)
    private Boolean active = true;
}
