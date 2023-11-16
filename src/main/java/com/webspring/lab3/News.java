package com.webspring.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class News {
    private String headline;
    private String content;
    private Project project;

    public News(@Value("${news.headline}") String headline, @Value("${news.content}") String content) {
        this.headline = headline;
        this.content = content;
    }

    @Autowired
    public void setProject(Project project) {
        this.project = project;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Project getProject() {
        return project;
    }

    public void someMethod() {
        System.out.println("Виконання методу someMethod...");
    }

    public void anotherMethod() {
        System.out.println("Виконання методу anotherMethod...");
    }}


