package com.schoolProject.ecommerceApplication.security;


import com.schoolProject.ecommerceApplication.entity.User;
import com.schoolProject.ecommerceApplication.exception.NotFoundException;
import com.schoolProject.ecommerceApplication.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

      User user = userRepo.findByEmail(username)
                .orElseThrow(()-> new NotFoundException("user/ email not found"));

        return AuthUser.builder()
                .user(user)
                .build();
    }
}
