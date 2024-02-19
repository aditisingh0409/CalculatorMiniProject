FROM openjdk:17
COPY ./target/Calculator_MT2023085-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD [“java”,”-jar”,” Calculator_MT2023085-0.0.1-SNAPSHOT.jar”]