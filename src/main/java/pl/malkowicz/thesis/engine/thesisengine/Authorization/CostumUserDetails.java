package pl.malkowicz.thesis.engine.thesisengine.Authorization;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import pl.malkowicz.thesis.engine.thesisengine.Domain.User;

import java.util.ArrayList;
import java.util.Collection;

public class CostumUserDetails implements UserDetails {

    private String username;
    private String password;
    private boolean enabled;

    public CostumUserDetails(User user) {
        this.username = user.getEmail();
        this.password = user.getPassword();
        enabled = true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<? extends GrantedAuthority> grantedAuthorities = new ArrayList<>();

        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
