FROM vaggarwa/jdk8mvnenv
MAINTAINER test "test@gmail.com"
VOLUME /tmp
ADD target/docker-spring-0.0.1.jar springboot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springboot.jar"]