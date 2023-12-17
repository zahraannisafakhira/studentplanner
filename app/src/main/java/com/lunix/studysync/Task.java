package com.lunix.studysync;

public class Task {
        String name, course, date;

    public Task(String name, String course, String date) {
        this.name = name;
        this.course = course;
        this.date = date;
    }

    public Task() {
    }

    public String getName() {
        return name;
    }

        public String getCourse() {
            return course;
        }

        public String getDate() {
            return date;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

