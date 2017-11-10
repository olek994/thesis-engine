package pl.malkowicz.thesis.engine.thesisengine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.malkowicz.thesis.engine.thesisengine.Domain.Person;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */

public interface PersonRepository extends JpaRepository<Person, Long>{

    Person findByEmailAndPassword(String email, String password);
}
