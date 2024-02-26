package com.algoExpert.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private int comment_id;
    private String username;
    private String date_created;
    private String comment;

//    constructors

    public Comment() {
    }

    public Comment(int comment_id, String username, String date_created, String comment) {
        this.comment_id = comment_id;
        this.username = username;
        this.date_created = date_created;
        this.comment = comment;
    }

//    getters and setters

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
