package com.cermati.demo.service;


import com.cermati.demo.model.User;
import com.cermati.demo.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Page<User> getAll(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }

    @Override
    public Optional<User> getById(UUID id) {
        return this.userRepository.findById(id);
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public Optional<User> update(UUID id, User requestUser) {
        // Implement Update
        return null;
    }

    @Override
    public Optional<User> delete(UUID id) {
        // Implement Delete
        return null;
    }
}