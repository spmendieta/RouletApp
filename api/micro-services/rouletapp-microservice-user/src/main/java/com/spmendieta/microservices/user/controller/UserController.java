package com.spmendieta.microservices.user.controller;

import com.spmendieta.microservices.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spmendietadev
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok().body(userService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }
}
