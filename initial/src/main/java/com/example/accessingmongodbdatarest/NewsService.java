package com.example.accessingmongodbdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public News create(String title, String description, String story, int type, String imageUrl) {
        return newsRepository.save(new News(title, description, story, type, imageUrl));
    }

    public List<News> getAll() {
        return newsRepository.findAll();
    }

    public News getByTitle(String title) {
        return newsRepository.findByTitle(title);
    }

    public News update(String title, String description, String story, int type, String imageUrl) {
        News news = newsRepository.findByTitle(title);
        news.setDescription(description);
        news.setImageUrl(imageUrl);
        news.setStory(story);
        news.setTitle(title);
        news.setType(type);
        return newsRepository.save(news);
    }

    public void deleteAll() {
        newsRepository.deleteAll();
    }

    public void delete(String title) {
        News news = newsRepository.findByTitle(title);
        newsRepository.delete(news);
    }
}
