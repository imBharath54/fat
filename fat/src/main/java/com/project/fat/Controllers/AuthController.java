package com.project.fat.Controllers;

import com.project.fat.Dto.LoginDTO;
import com.project.fat.Factory.ServiceFactory;
import com.project.fat.Repository.UserRepository;
import com.project.fat.Services.AuthService;
import com.project.fat.Services.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    private AuthService authService;
    @Autowired
    private ServiceFactory serviceFactory;

    @PostMapping("/user/login")
    public ResponseEntity<?> userLogin(@RequestBody LoginDTO loginDTO){


        authService = serviceFactory.getService("user");
        boolean valid = authService.isValid(loginDTO);
        if (valid){
            return ResponseEntity.ok("Valid credentials");
        }
        return new ResponseEntity<>("Invalid", HttpStatus.NOT_FOUND);

    }

}
