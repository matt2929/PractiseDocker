#! /bin/bash

sudo docker-compose up -d 
cd java
javac *.java
java Runner

