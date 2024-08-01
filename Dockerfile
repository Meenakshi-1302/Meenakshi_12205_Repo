
FROM openjdk:18
WORKDIR /app
COPY ./target/OnlineGroceryManagementSystem1-0.0.1-SNAPSHOT.jar /app
EXPOSE 8086
CMD ["java", "-jar", "OnlineGroceryManagementSystem1-0.0.1-SNAPSHOT.jar"]
 
