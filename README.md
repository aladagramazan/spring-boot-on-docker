# spring-boot-on-docker
run spring boot web on docker

docker run -it openjdk:……
docker exec container_name ls /tmp

Copy jar to container :

add  <finalName>springboot-docker</finalName> to pom

and then run mvn package --> create jar file

docker cp target/springboot-docker.jar container_name:/tmp


docker commit --change='CMD ["java", "-jar","/tmp/springboot-docker.jar"]' gallant_swanson remaladag/springboot-docker:v2

docker run -p 8082:8082 remaladag/springboot-docker:v2

docker build -t remaladag/springboot-docker:v3 .

docker run -p 8082:8082 remaladag/springboot-docker:v3


# docker commands
docker ps
docker ps -a
docker images
docker rmi image_id
docker rm container_id
docker-compose down
docker-compose up --build
docker network ls