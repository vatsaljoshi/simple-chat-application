Real-Time Chat Application

A minimal real-time chat app built with Spring Boot, WebSockets (STOMP over SockJS), and plain JavaScript (Vanilla JS). Includes a fun "CEO Roast Chat" demo featuring Sam Altman, Mark Zuckerberg, Larry Ellison, and Bill Gates.

🧩 Features

Real-time messaging using WebSockets and STOMP

SockJS fallback for older browsers

Simple broadcasting via Spring Boot's in-memory message broker

Vanilla JS frontend — no frameworks required

Automatic scrolling and CORS configuration

Fun demo script: fake chat between tech CEOs

📋 Tech Stack

Backend: Java 17+, Spring Boot, Spring WebSocket

Frontend: HTML5, CSS (Bootstrap), Vanilla JavaScript, SockJS, STOMP.js

Build Tool: Maven or Gradle

⚙️ Prerequisites

Java Development Kit (JDK) 17 or newer

Maven 3.6+ (or Gradle 7+)

Git

🚀 Installation & Setup

There are two ways to run this application:

1. Embedded Spring Boot (for development)

Clone the repository

git clone https://github.com/your-username/real-time-chat.git
cd real-time-chat

Build the project

mvn clean package

Run with Spring Boot

mvn spring-boot:run

Open the chat UI
Navigate to: http://localhost:8080/chat.html

2. Deploy to Apache Tomcat (for production-like environment)

Build a WAR file

mvn clean package -Pwar

This generates target/real-time-chat.war.

Copy the WAR to Tomcat

cp target/real-time-chat.war $TOMCAT_HOME/webapps/

Start Tomcat (if not already running)

$TOMCAT_HOME/bin/startup.sh

Access the chat UI via Tomcat
Navigate to: http://localhost:8080/real-time-chat/chat.html

3. Run in Eclipse IDE

Import the project

Open Eclipse and go to File → Import → Existing Maven Projects.

Select the project root folder and click Finish.

Run the application

Locate the main class with @SpringBootApplication (e.g., RealTimeChatApplication.java).

Right-click the file → Run As → Java Application.

Open the chat UI

Once the console shows Started RealTimeChatApplication, open:
http://localhost:8080/chat.html in your browser.

🔧 Configuration

WebSocket Endpoint: /chat

Message Send Prefix: /app (mapped to @MessageMapping)

Broadcast Topic Prefix: /topic

CORS: Allowed origin patterns set to * for development

To change settings, edit WebSocketConfig.java in src/main/java/com/chat/app/config/.

🎬 Usage

Enter your name in the name field.

Type a message and click Send.

Watch messages appear in real-time for all connected users.

Check out the "CEO Roast Chat" demo by refreshing the page.

📸 Screenshots

(Place your demo screenshots here in docs/ folder and reference below.)



🤝 Contributing

Fork the repository.

Create a feature branch: git checkout -b feature/YourFeature.

Commit your changes: git commit -m "Add YourFeature".

Push to your branch: git push origin feature/YourFeature.

Open a Pull Request.

