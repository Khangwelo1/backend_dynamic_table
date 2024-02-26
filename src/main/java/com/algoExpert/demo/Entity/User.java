
 package com.algoExpert.demo.Entity;


 import jakarta.persistence.*;

 import java.util.List;

 @Entity
public class User {

  @Id
  @GeneratedValue
  private Integer user_id;
  private String username;
  private String email;

  // relationships
  @ManyToMany
  @JoinTable(name = "user_project",
          joinColumns = @JoinColumn(name = "user_id"),
          inverseJoinColumns = @JoinColumn(name = "project_id"))
  private List<Project> projects;

  @OneToMany
     private List<Task> tasks;

  @OneToMany
     private List<Comment> comments;

//  constructors

     public User() {
     }

     public User(Integer user_id, String username, String email,
                 List<Project> projects, List<Task> tasks, List<Comment> comments) {
         this.user_id = user_id;
         this.username = username;
         this.email = email;
         this.projects = projects;
         this.tasks = tasks;
         this.comments = comments;
     }

//     getters and setters

     public Integer getUser_id() {
         return user_id;
     }

     public void setUser_id(Integer user_id) {
         this.user_id = user_id;
     }

     public String getUsername() {
         return username;
     }

     public void setUsername(String username) {
         this.username = username;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public List<Project> getProjects() {
         return projects;
     }

     public void setProjects(List<Project> projects) {
         this.projects = projects;
     }

     public List<Task> getTasks() {
         return tasks;
     }

     public void setTasks(List<Task> tasks) {
         this.tasks = tasks;
     }

     public List<Comment> getComments() {
         return comments;
     }

     public void setComments(List<Comment> comments) {
         this.comments = comments;
     }
 }

