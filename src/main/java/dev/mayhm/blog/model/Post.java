package dev.mayhm.blog.model;

import java.time.LocalDate;
import java.util.Objects;

public class Post {

    private int id;
    private String title;
    private String author;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
    private String body;
    private String imagePath;



    public Post(String title,
                String body) {
        this.title = title;
        this.author = "John Paul Jayme";
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id && Objects.equals(title, post.title) && Objects.equals(author, post.author) && Objects.equals(dateCreated, post.dateCreated) && Objects.equals(dateUpdated, post.dateUpdated) && Objects.equals(body, post.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, dateCreated, dateUpdated, body);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                ", body='" + body + '\'' +
                '}';
    }
}
