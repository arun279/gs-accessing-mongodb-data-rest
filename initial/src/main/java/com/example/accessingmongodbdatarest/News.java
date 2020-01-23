package com.example.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class News {
    @Id private String id;
    private String title;
    private String description;
    private String story;
    private int type;
    private String imageUrl;

    public News(String title, String description, String story, int type, String imageUrl) {
        this.description = description;
        this.story = story;
        this.type = type;
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String toString() {
        return "story title:" + title;
    }
}