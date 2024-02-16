package ru.job4j.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.rest.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}