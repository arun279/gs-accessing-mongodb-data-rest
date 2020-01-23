package com.example.accessingmongodbdatarest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    public User findByUsername(String username);
    public List<User> findByRole(int role);
}