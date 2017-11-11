package pl.malkowicz.thesis.engine.thesisengine.Service;

import pl.malkowicz.thesis.engine.thesisengine.Dto.UserDto;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public interface UserService  {

    List<UserDto> getAllUsers();
    UserDto createUser(UserDto userDto);
    UserDto getUser(Long id);
    UserDto findByEmailAndPassword(String email, String password);
}
