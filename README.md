# Веб-чат на SpringBoot

Этот проект представляет собой веб-чат, созданный с использованием Spring Boot и связанных технологий. Проект демонстрирует, как можно создать реальное приложение для обмена сообщениями в реальном времени с использованием WebSocket и других современных технологий.
![text](https://github.com/ugownqvckflq/chat-app/blob/main/image.png)
# Технологии использованные в проекте
- Spring Boot
- Spring Data JPA
- Spring WebSocket
- Spring Session
- MongoDB
- Thymeleaf
- Javascript

# Установка проекта локально
1. Клонирование репозитория
- `git clone https://github.com/ugownqvckflq/chat-app`

2. Запустить контейнеры с помощью команды:
- `docker-compose up -d`

3. Перейти на адрес
- `http://localhost:8088`

4. Открыть другое окно в режиме инкогнито и перейти на аналогичный адрес
5. Протестировать работу, из одного браузера приходит сообщение в другое и наоборот

# Установка проекта с помощью docker-compose
1. Можно загрузить на сервер image с названием nazarov/chat-app
- `docker pull nazarov/chat-app`
