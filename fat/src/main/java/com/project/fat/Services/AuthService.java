package com.project.fat.Services;

import com.project.fat.Dto.LoginDTO;

public interface AuthService {
    boolean isValid(LoginDTO loginDTO);
}
