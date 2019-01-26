package com.okta.developer.repository;

import com.okta.developer.domain.Group;
import com.okta.developer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

}