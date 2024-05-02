package dev.mayhm.blog.model;

import java.time.LocalDate;

public class Post {

    int id;
    String title;
    String author;
    LocalDate dateCreated;
    LocalDate dateUpdated;
    String body;

    public Post(int id, String title, String author,
                String body) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.dateCreated = LocalDate.now();
        this.dateUpdated = LocalDate.now();
        this.body = body;
    }

    public Post(){}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public String getBody() {
        return body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
