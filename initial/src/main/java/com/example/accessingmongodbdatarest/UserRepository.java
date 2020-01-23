package com.example.accessingmongodbdatarest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "user", path = "user")
//public interface UserRepository extends MongoRepository<User, String> {
//    public User findByUsername(@Param("usernname") String username);
//    public List<User> findbyRole(@Param("role") int role);
//}

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    public User findByUsername(String username);
    public List<User> findByRole(int role);
}