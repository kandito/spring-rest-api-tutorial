package com.cermati.demo.service;

import com.cermati.demo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    Page<User> getAll(Pageable pageable);
    Optional<User> getById(UUID id);
    User create(User user);
    Optional<User> update(UUID id, User user);
    Optional<User> delete(UUID id);
}
