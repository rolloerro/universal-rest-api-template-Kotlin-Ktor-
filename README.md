🟧 Universal REST API Template — Kotlin + Ktor
<p align="center"> <img src="https://img.shields.io/badge/Kotlin-1.9+-7F52FF?logo=kotlin&logoColor=white" /> <img src="https://img.shields.io/badge/Ktor-2.x-0B7285?logo=ktor&logoColor=white" /> <img src="https://img.shields.io/badge/Gradle-Kotlin%20DSL-02303A?logo=gradle&logoColor=white" /> <img src="https://img.shields.io/badge/Build-Passing-brightgreen" /> <img src="https://img.shields.io/badge/License-MIT-lightgrey" /> </p>
🚀 Описание

Universal REST API Template (Kotlin + Ktor) — это чистый, лёгкий и расширяемый шаблон для API-приложений, микросервисов, прототипов и продакшн-сервисов.

✔ Мгновенный старт
✔ Чистая архитектура
✔ Отдельные роуты
✔ Kotlinx Serialization
✔ Prod-ready структура

Никакого мусора — только essentials.

⚡ Stack
Технология	Использование
Kotlin 1.9+	Язык разработки
Ktor 2.x	HTTP server framework
Gradle Kotlin DSL	Сборка проекта
Kotlinx Serialization	Работа с JSON
SLF4J (в планах)	Логирование
Docker (в планах)	Контейнеризация
📦 Структура проекта
src/
└── main/
    ├── kotlin/
    │   └── app/
    │       ├── Server.kt
    │       └── routes/
    │           ├── RootRoute.kt
    │           ├── PingRoute.kt
    │           └── EchoRoute.kt
    └── resources/
        └── application.conf

build.gradle.kts
settings.gradle.kts
README.md


📌 Маршруты полностью изолированы
📌 Главный сервер собирает их в единое приложение

▶️ Запуск
Dev-режим
./gradlew run

Полная сборка + запуск
./gradlew build
./gradlew run

🔄 API Endpoints
Method	Path	Description
GET	/	Корневой маршрут
GET	/ping	Проверка сервера
POST	/echo	Возвращает присланный JSON
Пример POST /echo

📤 Запрос:

{
  "message": "hello"
}


📥 Ответ:

{
  "message": "hello"
}

🧭 Roadmap

 Dockerfile

 docker-compose

 logback.xml

 CI GitHub Actions

 JWT auth module

 Rate limiting

 CORS-конфигуратор

 Модульное тестирование (JUnit / Ktor Test)

📄 Лицензия

MIT License — делай что хочешь 🙃

👤 Автор

Template by rolloerro
Kotlin / Ktor / Backend Engineering
