# Проект по автоматизации тестирования мобильного приложения Wikipedia (Android)

### Используемые технологии и инструменты:
<p align="left">
<img height="40" width="40" src="images/java-logo.svg" alt="java">
<img height="40" width="40" src="images/gradle-logo.svg" alt="gradle">
<img height="40" width="40" src="images/IDEA-logo.svg" alt="IDEA">
<img height="40" width="40" src="images/git-logo.svg" alt="git">
<img height="40" width="40" src="images/junit5-logo.svg" alt="junit5">
<img height="40" width="40" src="images/selenide-logo.svg" alt="selenide">
<img height="40" width="40" src="images/jenkins-logo.svg" alt="jenkins">
<img height="40" width="40" src="images/browserstack-logo.svg" alt="browserstack">
<img height="40" width="40" src="images/allure-Report-logo.svg" alt="allure">
<img height="40" width="40" src="images/allure-ee-logo.svg" alt="allure-testops">
<img height="40" width="40" src="images/jira-logo.svg" alt="jira">
</p>

### Реализованы следующие тесты:
- [X] Поис в приложении Wikipedia
- [X] Переход к статье Wikipedia
- [X] Проверка наличия опции Login в меню

### Запуск тестов
#### Запуск тестов с использованием Jenkins:
![image](images/jenkins-main.png)

#### Запуск тестов локально:
```bash
gradle clean test
```

### Allure отчет для отображения результатов тестирования </br>
#### Общая информация
![image](images/allure-report-overview.png)
#### Список тестов c описанием шагов и визуализацией результатов
![image](images/allure-report-behavior.png)

### Пример запуска теста в BrowserStack
![video](https://github.com/PercyGB/qa.guru.mobile-browsestack/blob/master/images/browserstack-video.gif)

### Интеграция с Allure TestOps </br>
![image](images/allure-testops-test-types.png)
![image](images/allure-testops-visualization.png)

### Интеграция с Jira </br>
![image](images/allure-testops-issue.png)
![image](images/allure-testops-launch.png)
![image](images/jira.png)

### Уведомления в telegram о результатах теста </br>
![image](images/telegram-notification.png)


:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
