FROM openjdk:8
 
VOLUME /cloud-consumer-order
 
ADD cloud-consumer-order/target/cloud-provide-payment-1.0-SNAPSHOT.jar app.jar
 
EXPOSE 8002
 
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=cloud-consumer-order-ml", "--server.port=8001", "> /log/app.log"]