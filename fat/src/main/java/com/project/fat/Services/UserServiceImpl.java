package com.project.fat.Services;

import com.project.fat.Entity.User;
import com.project.fat.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);

    }


    public User getUserByEmail(String email){
        Optional<User> user = userRepository.findByemail(email);

        if (user != null){
            return user.get();
        }
        else {
            return null;
        }
    }

    @Override
    public void deleteUser(String email) {
        Optional<User> user = userRepository.findByemail(email);
        userRepository.deleteById(user.get().getId());
    }
}