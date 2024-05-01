package dev.mayhm.personalblog.model;

import java.time.LocalDate;

public class Post {

    int id;
    String title;
    String author;
    LocalDate date;
    String body;


    public Post(int id, String title, String author, LocalDate date, String body) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getBody() {
        return body;
    }
}
