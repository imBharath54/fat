package com.project.fat.Services;

import com.project.fat.Dto.LoginDTO;
import org.springframework.stereotype.Service;

@Service("TechAuthService")
public class TechAuthService implements AuthService {
    @Override
    public boolean isValid(LoginDTO loginDTO) {
        return false;
    }
}
