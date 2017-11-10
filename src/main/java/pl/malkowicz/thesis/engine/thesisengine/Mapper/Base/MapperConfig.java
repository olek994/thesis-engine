package pl.malkowicz.thesis.engine.thesisengine.Mapper.Base;

import ma.glasnost.orika.MapperFactory;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public interface MapperConfig {
    void configure(MapperFactory factory);
}
