package com.example.accessingmongodbdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/newscreate")
    public String create(@RequestParam String title, @RequestParam String description, @RequestParam String story, @RequestParam int type, @RequestParam String imageUrl) {
        News news = newsService.create(title, description, story, type, imageUrl);
        return news.toString();
    }

    @RequestMapping("/newsget")
    public News getNews(@RequestParam String title) {
        return newsService.getByTitle(title);
    }

    @RequestMapping("/newsgetAll")
    public List<News> getAll() {
        return newsService.getAll();
    }

    @RequestMapping("/newsupdate")
    public String update(@RequestParam String title, @RequestParam String description, @RequestParam String story, @RequestParam int type, @RequestParam String imageUrl) {
        News news = newsService.update(title, description, story, type, imageUrl);
        return news.toString();
    }

    @RequestMapping("/newsdelete")
    public String delete(@RequestParam String title) {
        newsService.delete(title);
        return "Deleted " + title;
    }

    @RequestMapping("/newsdeleteAll")
    public String deleteAll() {
        newsService.deleteAll();
        return "Deleted all records";
    }
}