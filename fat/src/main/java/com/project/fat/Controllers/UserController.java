package com.project.fat.Controllers;


import com.project.fat.Dto.LoginDTO;
import com.project.fat.Entity.User;
import com.project.fat.Dto.UserDto;
import com.project.fat.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<UserDto> getUser(@RequestBody LoginDTO loginDTO){
        User user = userService.getUserByEmail(loginDTO.getEmail());

        System.out.println(user);

        if (user != null){
            UserDto userDto = new  UserDto(user);

            return new ResponseEntity<>(userDto, HttpStatus.OK);
        }
        return new ResponseEntity<>(new UserDto(),HttpStatus.NOT_FOUND);

    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);

    }


    @DeleteMapping("/user/{email}")
    public void deleteUser(@PathVariable("email") String email){
        userService.deleteUser(email);

    }





}
