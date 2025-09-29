package com.my.backend.service;

import com.my.backend.dto.CreateUserRequest;
import com.my.backend.entity.User;
import com.my.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User create(CreateUserRequest requset) {
        User user = new User();
        user.setName(requset.getName());
        user.setCity(requset.getCity());
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
