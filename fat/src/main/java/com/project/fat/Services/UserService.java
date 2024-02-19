package com.project.fat.Services;

import com.project.fat.Entity.User;

public interface UserService {
    void addUser(User user);
    User getUserByEmail(String email);

    void deleteUser(String email);
}
