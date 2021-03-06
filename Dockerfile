FROM maven:3.5.4-jdk-8

MAINTAINER Junlan Shuai <shuaijunlan.gmail.com>

COPY docker-entrypoint.sh /usr/local/bin
COPY . /home/junlan/workspace/Spring-Learning

WORKDIR /home/junlan/workspace/Spring-Learning

RUN mvn install -pl springcloud/service-register -am -DskipTests

RUN set -ex \
 && chmod a+x /usr/local/bin/docker-entrypoint.sh

EXPOSE 1111

ENTRYPOINT ["docker-entrypoint.sh"]