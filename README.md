🟧 Universal REST API Template — Kotlin + Ktor










💡 Готовый профессиональный шаблон REST API на Kotlin + Ktor, созданный для быстрых стартапов, pet-проектов, микросервисов и демонстрации навыков в портфолио.

🚀 Возможности

✔️ Готовые эндпоинты:

GET / — корневой маршрут

GET /ping — health check

POST /echo — echo API (принимает JSON → возвращает JSON)

✔️ Чистая структура проекта
✔️ Kotlinx Serialization
✔️ Ktor Routing
✔️ Возможность расширения под микросервисы
✔️ Подготовка к Docker
✔️ Поддержка dev-mode

🛠 Технологии

Kotlin 1.9+

Ktor 2.x

Gradle Kotlin DSL

Kotlinx Serialization

SLF4J (в планах логирование)

📂 Структура
universal-rest-api-template-Kotlin-Ktor-
├── src
│   └── main
│       ├── kotlin
│       │   └── app
│       │       ├── Server.kt
│       │       └── routes
│       │           ├── RootRoute.kt
│       │           ├── PingRoute.kt
│       │           └── EchoRoute.kt
│       └── resources
│           └── application.conf
├── build.gradle.kts
├── settings.gradle.kts
└── README.md

▶️ Запуск
Dev-режим (автоперезапуск)
./gradlew run

Обычный запуск
./gradlew build
./gradlew run

🔄 Эндпоинты
Метод	Путь	Описание
GET	/	Приветственное сообщение
GET	/ping	Проверка сервера
POST	/echo	Возвращает присланный JSON
Пример POST /echo

Запрос:

{
  "message": "hello"
}


Ответ:

{
  "message": "hello"
}

🧭 Статус проекта

Проект в активной разработке
В планах:

Dockerfile

docker-compose

logback.xml

GitHub Actions CI

Расширенные health checks

JWT + Auth template

📄 Лицензия

MIT License

👤 Автор

Kotlin Universal REST Template
by rolloerro
