package com.project.fat.Factory;

import com.project.fat.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {

    @Autowired
    @Qualifier("UserAuthService")
    private AuthService userService;

    @Autowired
    @Qualifier("TechAuthService")
    private AuthService techService;

    public AuthService getService(String type) {
        System.out.println("Called");
        if ("user".equals(type)) {
            return userService;
        } else {
            return techService;
        }
    }
}
