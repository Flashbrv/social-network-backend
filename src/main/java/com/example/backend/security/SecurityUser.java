package com.example.backend.security;

import com.example.backend.entity.Status;
import com.example.backend.entity.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class SecurityUser extends org.springframework.security.core.userdetails.User {

    private final Long id;
    public SecurityUser(Long id, String username, String password, Collection<? extends GrantedAuthority> authorities, boolean isActive) {
        super(username, password, isActive, isActive, isActive, isActive, authorities);
        this.id = id;
    }

//    String username, String password, boolean enabled, boolean accountNonExpired,
//    boolean credentialsNonExpired, boolean accountNonLocked,
//    Collection<? extends GrantedAuthority> authorities
    public Long getId() {
        return id;
    }

    public static SecurityUser fromUser(User user) {
        return new SecurityUser(
                user.getId(),
                user.getEmail(), user.getPassword(),
                user.getRole().getAuthorities(),
                user.getStatus().equals(Status.ACTIVE)
        );
    }
}
