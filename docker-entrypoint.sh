#!/usr/bin/env bash
if [[ "$1" == "service-register" ]]; then
    echo "start service register center"
    java -jar ./springcloud/service-register/target/service-register-0.0.1-SNAPSHOT.jar
fi