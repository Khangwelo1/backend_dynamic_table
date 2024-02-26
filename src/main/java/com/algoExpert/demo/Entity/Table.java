package com.algoExpert.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Tables_Tables")
public class Table {


    @Id
    @GeneratedValue()
    private int table_id;
    private String table_name;

//    relationships
    @OneToMany
    List<Task> tasks;
//  constructors


    public Table() {
    }

    public Table(int table_id, String table_name, List<Task> tasks) {
        this.table_id = table_id;
        this.table_name = table_name;
        this.tasks = tasks;
    }
//    getters and setters

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
