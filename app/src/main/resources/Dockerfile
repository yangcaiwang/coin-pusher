#FROM java:8
FROM openjdk:8-jdk-alpine
# 作者
MAINTAINER ycw
# VOLUME 指定临时文件目录为/tmp，在主机/var/lib/docker目录下创建了一个临时文件并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为 wz_docker.jar
ADD app-1.0-SNAPSHOT.jar coin-pusher.jar
# 暴露端口
EXPOSE 9000
# 执行命令
ENTRYPOINT ["java","-jar","/coin-pusher.jar"]
