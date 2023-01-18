package com.restapiv0.restapiv0.user;

import com.restapiv0.restapiv0.exceptions.InvalidIdException;
import com.restapiv0.restapiv0.exceptions.InvalidUserException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) throws InvalidIdException {
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public User addUser(@RequestBody @Valid User user, BindingResult bindingResult) throws InvalidUserException {
        return userService.addUser(user, bindingResult);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody @Valid User user, BindingResult bindingResult) throws InvalidUserException {
        return userService.updateUser(id, user, bindingResult);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) throws InvalidIdException {
        userService.deleteUser(id);
    }
}