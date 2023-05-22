FROM maven:3.8.5-openjdk-17-slim

RUN mkdir /back-end

WORKDIR /back-end

COPY . .

RUN mvn clean package

EXPOSE 8080

COPY /target/autos-0.0.1-SNAPSHOT.war .

CMD ["java","-jar","autos-0.0.1-SNAPSHOT.war"]


