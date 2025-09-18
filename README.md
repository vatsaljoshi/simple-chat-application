# Real-Time Chat Application

A minimal **real-time chat app** built with **Spring Boot**, **WebSockets (STOMP over SockJS)**, and **Vanilla JavaScript**. Includes a fun _"CEO Roast Chat"_ demo featuring Sam Altman, Mark Zuckerberg, Larry Ellison, and Bill Gates.

---
## 🧩 Features

- Real-time messaging using **WebSockets + STOMP**
- **SockJS** fallback for older browsers
- In-memory broadcasting via **Spring Boot message broker**
- Lightweight frontend with **Vanilla JS** (no frameworks)
- Automatic scrolling and **CORS configuration**
- Fun demo script: fake chat between tech CEOs

---
## 📋 Tech Stack

- **Backend**: Java 17+, Spring Boot, Spring WebSocket
- **Frontend**: HTML5, CSS (Bootstrap), Vanilla JavaScript, SockJS, STOMP.js
- **Build Tool**: Maven / Gradle

---
## ⚙️ Prerequisites

- Java 17+
- Maven 3.6+ / Gradle 7+
- Git

---
## 🚀 Getting Started

### Option 1: Run with Spring Boot (Development)
`git clone https://github.com/your-username/real-time-chat.git cd real-time-chat mvn clean package mvn spring-boot:run`
Open 👉 [http://localhost:8080/chat.html](http://localhost:8080/chat.html)

---
### Option 2: Deploy on Apache Tomcat (Production-like)
`mvn clean package -Pwar cp target/real-time-chat.war $TOMCAT_HOME/webapps/ $TOMCAT_HOME/bin/startup.sh`
Open 👉 [http://localhost:8080/real-time-chat/chat.html](http://localhost:8080/real-time-chat/chat.html)

---
### Option 3: Run in Eclipse
- Import → _Existing Maven Project_
- Run the `@SpringBootApplication` main class (e.g., `RealTimeChatApplication.java`)
- Open 👉 [http://localhost:8080/chat.html](http://localhost:8080/chat.html)

---
## 🔧 Configuration

- **WebSocket Endpoint**: `/chat`
- **Send Prefix**: `/app` (mapped to `@MessageMapping`)
- **Broadcast Topic Prefix**: `/topic`
- **CORS**: Allowed origin patterns = `*` (for dev)

To modify, edit `WebSocketConfig.java` in `src/main/java/com/chat/app/config/`.

---
## 🎬 Usage

1. Enter your name in the input field.
2. Type a message and click **Send**.
3. Messages appear in real-time for all connected users.
4. Refresh to check out the fun _"CEO Roast Chat"_ demo.

---
## 📸 Screenshots

  ~ for images, refer my linkedin post here: https://tinyurl.com/23fm8uup

---
## 🤝 Contributing

1. Fork this repo
2. Create a branch → `git checkout -b feature/YourFeature`
3. Commit changes → `git commit -m "Add YourFeature"`
4. Push branch → `git push origin feature/YourFeature`
5. Open a Pull Request

---
