    package com.webspring.lab3;

    import jakarta.annotation.PostConstruct;
    import jakarta.annotation.PreDestroy;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.stereotype.Component;


    @Component
    public class Project {
        private NewsPage newsPage;
        private String projectName;

        public Project(@Value("${project.projectName}") String projectName) {
            this.projectName = projectName;
        }

        @Autowired
        public void setNewsPage(NewsPage newsPage) {
            this.newsPage = newsPage;
        }

        @PostConstruct
        public void init() {

            System.out.println("Project ініціалізовано з ім'ям " + projectName);
        }

        @PreDestroy
        public void destroy() {

            System.out.println("Project завершує роботу");
        }

        public NewsPage getNewsPage() {
            return newsPage;
        }


        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }
    }