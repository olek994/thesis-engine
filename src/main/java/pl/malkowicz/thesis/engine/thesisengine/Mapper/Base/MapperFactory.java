package pl.malkowicz.thesis.engine.thesisengine.Mapper.Base;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Configuration
public class MapperFactory {


    @Bean
    public MapperFacade createMapper(MapperConfig[] cfgs) {

        return new ConfigurableMapper() {

            @Override
            protected void configure(ma.glasnost.orika.MapperFactory factory) {
                for (MapperConfig mapperConfig : cfgs) {
                    mapperConfig.configure(factory);
                }
            }
        };
    }

}
