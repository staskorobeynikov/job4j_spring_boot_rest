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

    public boolean update(User user) {
        return repository.update(user) > 0L;
    }

    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    public boolean deleteById(Long id) {
        return repository.delete(id) > 0L;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

}
