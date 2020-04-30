package com.example.jissen.practice.chap17;

import java.time.LocalDate;

public class Movie {
    private String title;
    private LocalDate publishDate;

    public Movie() {
    }

    public Movie(String title) {
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("タイトルにnullは指定できません");
        }
        this.title = title;
    }

    public void setPublishDate(LocalDate publishDate) {
        if (publishDate == null) {
            throw new IllegalArgumentException("公開日にnullは指定できません");
        }
        if (publishDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("公開日に未来の日付は指定できません");
        }
        this.publishDate = publishDate;
    }
}
