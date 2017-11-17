package pl.malkowicz.thesis.engine.thesisengine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.malkowicz.thesis.engine.thesisengine.Domain.User;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */

public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmailAndPassword(String email, String password);
    User findByEmail(String email);
}
