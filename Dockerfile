FROM openjdk:25-oraclelinux9
ADD target/springboot-docker.jar springboot-docker.jar
ENTRYPOINT ["java", "-jar", "springboot-docker.jar"]