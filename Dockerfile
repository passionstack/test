FROM openjdk:8
 
VOLUME /tmp
 
ADD cloud-provide-payment/target/cloud-provide-payment-1.0-SNAPSHOT.jar app.jar
 
EXPOSE 8001
 
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=test-ml", "--server.port=8001", "> /log/app.log"]