package io.swagger.persitence;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Show;

public interface ShowRepository extends JpaRepository<Show, Integer>{ }
