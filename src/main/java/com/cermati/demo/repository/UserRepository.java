package com.cermati.demo.repository;

import com.cermati.demo.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, UUID> {
    Optional<User> findUserByMobilePhone(String mobilePhone);
}
