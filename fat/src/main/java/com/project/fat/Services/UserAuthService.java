package com.project.fat.Services;

import com.project.fat.Dto.LoginDTO;
import com.project.fat.Entity.User;
import com.project.fat.Repository.UserRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("UserAuthService")
public class UserAuthService implements AuthService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public boolean isValid(LoginDTO loginDTO) {
        Optional<User> user = userRepository.findByemail(loginDTO.getEmail());

        if (user.isPresent()){
            String password = user.get().getPassword();
            if (loginDTO.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

}
