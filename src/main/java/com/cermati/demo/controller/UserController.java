package com.cermati.demo.controller;


import com.cermati.demo.model.User;
import com.cermati.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<User> getAll(Pageable pageable) {
        return this.userService.getAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable UUID id) {
        return this.userService.getById(id)
                .orElseThrow(() -> new ResourceAccessException("User not found"));
    }

    @RequestMapping(method = RequestMethod.POST)
    public User create(@Valid @RequestBody User user) {
        return this.userService.create(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public User update(@PathVariable UUID id, @RequestBody User requestUser) {
        // Implement update
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        // Implement delete
        return null;
    }
}
