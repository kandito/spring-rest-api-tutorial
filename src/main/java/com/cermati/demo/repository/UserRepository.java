package com.cermati.demo.repository;

import com.cermati.demo.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends PagingAndSortingRepository<User, UUID> {
    Optional<User> findUserByMobilePhone(String mobilePhone);
}
