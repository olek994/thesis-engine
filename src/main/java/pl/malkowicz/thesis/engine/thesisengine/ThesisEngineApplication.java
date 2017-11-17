package pl.malkowicz.thesis.engine.thesisengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.malkowicz.thesis.engine.thesisengine.Authorization.CostumUserDetails;
import pl.malkowicz.thesis.engine.thesisengine.Repository.UserRepository;

@SpringBootApplication
@RestController
@EnableResourceServer
public class ThesisEngineApplication {

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String hello(){
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(ThesisEngineApplication.class, args);
	}

	//Bez tego w Oauth2Config nie mozna Autowired AuthenticationManager
	@Autowired
	public void autheticationManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception {
		builder.userDetailsService(s -> new CostumUserDetails(repo.findByEmail(s)));
	}

}
