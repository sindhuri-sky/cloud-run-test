FROM adoptopenjdk/openjdk8:jdk8u202-b08-alpine-slim

# Copy the jar to the production image from the builder stage.
COPY /build/libs/ref-compute-engine.jar /ref-compute-engine.jar

# Run the web service on container startup.
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dserver.port=${PORT}","-jar","/ref-compute-engine.jar"]