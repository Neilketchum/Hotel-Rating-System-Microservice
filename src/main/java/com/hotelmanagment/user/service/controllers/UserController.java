package com.hotelmanagment.user.service.controllers;

import com.hotelmanagment.user.service.entities.User;
import com.hotelmanagment.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    //Create
    @PostMapping("/saveuser")
    public ResponseEntity<User>createUser(@RequestBody User user){
        User createdUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
    //User
    @GetMapping("/{userId}")
    public ResponseEntity<User>getUserByUserid(@PathVariable String userId){
        User user = userService.getUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body(user);

    }
    //All User Get
    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>>getAllUser(){
        List<User> userList = userService.gettAllUser();
        return ResponseEntity.status(HttpStatus.OK).body(userList);
    }
}
