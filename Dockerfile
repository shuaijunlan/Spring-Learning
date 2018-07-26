FROM maven:3.5.4-jdk-8

MAINTAINER Junlan Shuai <shuaijunlan.gmail.com>

COPY docker-entrypoint.sh /usr/local/bin
COPY . /root/workspace

WORKDIR /root/workspace
RUN mvn clean
RUN mvn install -DskipTests

EXPOSE 1111

ENTRYPOINT ["docker-entrypoint.sh"]