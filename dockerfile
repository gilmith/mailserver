FROM alpine:latest

# Instalar OpenJDK 21
RUN apk --no-cache add openjdk21

# Establecer las variables de entorno de Java
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk
ENV PATH=$PATH:$JAVA_HOME/bin

WORKDIR /app
COPY ./target/mailService-0.0.13-SNAPSHOT.jar /app
CMD ["java", "-jar" , "mailService-0.0.13-SNAPSHOT.jar"]
