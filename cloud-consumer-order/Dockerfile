FROM openjdk:8
 
VOLUME /cloud-consumer-order
 
ADD target/cloud-consumer-order-1.0-SNAPSHOT.jar app.jar
 
EXPOSE 8002
 
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=cloud-consumer-order-ml", "--server.port=8002", "> /log/app.log"]