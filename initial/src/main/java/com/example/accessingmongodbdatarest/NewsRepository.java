package com.example.accessingmongodbdatarest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends MongoRepository<News, String> {
    public News findByTitle(String title);
    public List<News> findByType(int type);
}