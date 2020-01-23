package com.example.accessingmongodbdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User create(String username, String password, int role) {
        return userRepository.save(new User(username, password, role));
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User update(String username, String password, int role) {
        User user = userRepository.findByUsername(username);
        user.setPassword(password);
        user.setRole(role);
        return userRepository.save(user);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public void delete(String username) {
        User user = userRepository.findByUsername(username);
        userRepository.delete(user);
    }
}