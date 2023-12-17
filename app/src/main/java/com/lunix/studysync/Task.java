package com.lunix.studysync;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Task {
        String name, course, date;

    public Task() {
    }

    public Task(String name, String course, String date) {
        this.name = name;
        this.course = course;
        this.date = date;
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

}

