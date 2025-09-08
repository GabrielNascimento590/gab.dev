package com.exemple.cadastros.de.usuarios.controller;


import com.exemple.cadastros.de.usuarios.model.User;
import com.exemple.cadastros.de.usuarios.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/usuario")

public class UserController {

    //injeção de dependência
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
    @PostMapping
public User create(@RequestBody User user) {
        return userService.create(user);

    }
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }














}
