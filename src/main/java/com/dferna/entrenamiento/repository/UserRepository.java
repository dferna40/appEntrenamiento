package com.dferna.entrenamiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dferna.entrenamiento.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
