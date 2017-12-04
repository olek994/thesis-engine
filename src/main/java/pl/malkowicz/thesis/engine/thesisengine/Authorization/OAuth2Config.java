package pl.malkowicz.thesis.engine.thesisengine.Authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import pl.malkowicz.thesis.engine.thesisengine.Repository.UserRepository;

@Configuration
@EnableAuthorizationServer
public class OAuth2Config extends AuthorizationServerConfigurerAdapter{

    public static final String RESOURCE_ID = "thesis-resource";

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
    }

    //Dodanie clientow (third-part app)
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // TODO zmienic na pobranie z bazy
        clients.inMemory().withClient("thesis-android").secret("thesis").accessTokenValiditySeconds(1000)
                .scopes("read", "write","trust").authorizedGrantTypes("password", "refresh_token").resourceIds(RESOURCE_ID);
    }

}