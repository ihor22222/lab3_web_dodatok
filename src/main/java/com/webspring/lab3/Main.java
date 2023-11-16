package com.webspring.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		NewsPage newsPage = context.getBean(NewsPage.class);

		News news = newsPage.getNews();
		news.someMethod();
		news.anotherMethod();

		Project project = news.getProject();
		System.out.println("Проект: " + project.getProjectName());
		System.out.println("URL сторінки: " + newsPage.getPageUrl());
		System.out.println("Заголовок новини: " + news.getHeadline());
		System.out.println("Текст новини: " + news.getContent());
	}
}
