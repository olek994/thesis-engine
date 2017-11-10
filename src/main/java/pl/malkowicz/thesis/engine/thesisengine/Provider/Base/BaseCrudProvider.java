package pl.malkowicz.thesis.engine.thesisengine.Provider.Base;

import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import pl.malkowicz.thesis.engine.thesisengine.Dto.Base.BaseDto;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Slf4j
public abstract class BaseCrudProvider<E extends Serializable, T extends BaseDto<?>> {

    @Autowired
    protected MapperFacade mapper;

    private Class<T> dtoClazz;

    protected <D> D convert(E entity, Class<D> returnClass) {
        return mapper.map(entity, returnClass);
    }

    protected T convert(E entity) {
        return convert(entity, getDtoClass());
    }

    protected abstract E convertToEntity(T dto, E entity);


    protected <L> List<L> convert(Collection<E> entities, Class<L> returnClass) {
        return entities.stream().map(entity -> convert(entity, returnClass)).collect(Collectors.toCollection(ArrayList::new));
    }

    @SuppressWarnings("unchecked")
    public Class<T> getDtoClass() {
        if (dtoClazz == null) {
            try {
                String className = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1].getTypeName();
                dtoClazz = (Class<T>) Class.forName(className);
            } catch (ClassNotFoundException e) {
                log.error("DTO CLASS NOT FOUND", e);
            }
        }
        return dtoClazz;
    }

    protected List<T> convert(Collection<E> entities) {
        return convert(entities, getDtoClass());
    }
}
