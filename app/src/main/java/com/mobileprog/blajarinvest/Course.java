package com.mobileprog.blajarinvest;

public class Course {

    private long id;
    private String name;
    private int isCompleted;

    public Course(long id, String name, int isCompleted) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public Course(long id, String name) {
        this.id = id;
        this.name = name;
        this.isCompleted = 0;
    }

    public Course(String name) {
        this.name = name;
        this.isCompleted = 0;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(int isCompleted) {
        this.isCompleted = isCompleted;
    }
}
