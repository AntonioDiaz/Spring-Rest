package com.adiaz.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adiaz.beans.User;

public interface UserRepository  extends JpaRepository<User, Integer>{ }
