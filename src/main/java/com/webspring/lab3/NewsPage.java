package com.webspring.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPage {
    private News news;

    @Value("${news.pageUrl}")
    private String pageUrl;

    public NewsPage() {

    }

    @Autowired
    public void setNews(News news) {
        this.news = news;
    }
    public String getPageUrl() {
        return pageUrl;
    }
    public News getNews() {
        return news;
    }
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
}