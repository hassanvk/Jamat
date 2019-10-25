   FROM java:8
   COPY . /var/www/java
   WORKDIR /var/www/java
ADD target/JamatStatus-1.0-SNAPSHOT-jar-with-dependencies.jar /
# RUN javac src/main/java/com/hassan/JamatStatus/*.java
   CMD ["java", "-cp", "/JamatStatus-1.0-SNAPSHOT-jar-with-dependencies.jar","com.hassan.JamatStatus.main"]

# our base image
#FROM openjdk:8-jre-alpine

# specify the port number the container should expose
#EXPOSE 5000

#ADD run.sh /

#RUN chmod +x run.sh
# run the application
#CMD ["!/bin/sh","run.sh""]
#!/bin/sh
#nohup java -cp ./target/JamatStatus-1.0-SNAPSHOT-jar-with-dependencies.jar com.hassan.JamatStatus.main &
