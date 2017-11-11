package pl.malkowicz.thesis.engine.thesisengine.Service.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.malkowicz.thesis.engine.thesisengine.Dto.UserDto;
import pl.malkowicz.thesis.engine.thesisengine.Provider.UserProvider;
import pl.malkowicz.thesis.engine.thesisengine.Service.UserService;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserProvider UserProvider;

    @Override
    public List<UserDto> getAllUsers() {
        return UserProvider.getAllUsers();
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return UserProvider.createUser(userDto);
    }

    @Override
    public UserDto getUser(Long id) {
        return UserProvider.getUser(id);
    }

    @Override
    public UserDto findByEmailAndPassword(String email, String password) {
        return UserProvider.findByEmailAndPassword(email,password);
    }
}
