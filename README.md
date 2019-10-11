## Setup

1. Clone this repository.

2. If maven is installed and setup properly `mvn quarkus:dev` or `./mvnw.cmd quarkus:dev`


## To compile to native code 
```
mvnw clean package -Pnative
```

## To compile to native code using docker
```
mvnw clean package -Pnative -Dnative-image.docker-build=true
```

## Package and run application
```
mvn clean package -Dmaven.test.skip
java -jar target\*-runner.jar
```

## Running check style
```
mvn clean compile jxr:jxr checkstyle:checkstyle
```

## Running tests
```
Unit tests -> mvn clean test
```