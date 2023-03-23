FROM openjdk:11
EXPOSE 8080
ADD build/libs/REST-0.0.1-SNAPSHOT.jar myapp.jar
ADD build/libs/REST-0.0.1-SNAPSHOT-plain.jar.jar myapp.jar
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "-/app.jar"]