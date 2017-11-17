package pl.malkowicz.thesis.engine.thesisengine.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.malkowicz.thesis.engine.thesisengine.Domain.User;
import pl.malkowicz.thesis.engine.thesisengine.Dto.UserDto;
import pl.malkowicz.thesis.engine.thesisengine.Provider.Base.BaseCrudProvider;
import pl.malkowicz.thesis.engine.thesisengine.Repository.UserRepository;

import java.util.List;

/**
 * Created by Aleksander on 02.11.2017.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Component
public class UserProvider extends BaseCrudProvider<User, UserDto> {

    @Autowired
    UserRepository userRepository;

    public List<UserDto> getAllUsers(){
        return convert(userRepository.findAll());
    }

    public UserDto createUser(UserDto userDto){
        return convert(userRepository.save(convertToEntity(userDto,null)));
    }

    public UserDto getUser(Long id){
        return convert(userRepository.getOne(id));
    }

    public UserDto findByEmailAndPassword(String email, String password){
        return convert(userRepository.findByEmailAndPassword(email,password));
    }

    public UserDto findByEmail(String email){
        return convert(userRepository.findByEmail(email));
    }

    @Override
    protected User convertToEntity(UserDto dto, User entity) {
        if(entity == null){
            entity = new User();
        }
        entity.setName(dto.getName());
        entity.setSubname(dto.getSubname());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());

        if (dto.getRecipientId() != null) {
            entity.setRecipientId(dto.getRecipientId());
        }

        return entity;
    }
}
