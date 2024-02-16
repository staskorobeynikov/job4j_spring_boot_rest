package ru.job4j.rest.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.rest.model.User;
import ru.job4j.rest.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public void update(User user) {
        repository.save(user);
    }

    public Optional<User> findById(int id) {
        return repository.findById(id);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

}
