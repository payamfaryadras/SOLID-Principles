FROM openjdk:11-jre-slim
WORKDIR opt/program
COPY out/production/solid.jar /opt/program/
CMD java -jar solid.jar
