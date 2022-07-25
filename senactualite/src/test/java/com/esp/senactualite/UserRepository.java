package com.esp.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.esp.users.entities.Users;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByUsername(String username);
}
